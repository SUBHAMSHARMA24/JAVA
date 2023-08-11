// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.util.*;
// import javax.swing.*;
// import java.awt.*;

// class FCFS_Algorithm {
//     ArrayList<String> ProcessIDs;
//     ArrayList<Integer> ArrivalTime;
//     ArrayList<Integer> BurstTime;
//     ArrayList<String> DisposalProcessIDs;
//     ArrayList<Integer> DisposalArrivalTime;
//     ArrayList<Integer> DisposalBurstTime;
//     LinkedList<String> FinalProcessID;
//     LinkedList<Integer> FinalArrivalTime;
//     LinkedList<Integer> FinalBurstTime;

//     LinkedList<Integer> FinalSortedArrivalTime;
//     LinkedList<Integer> FinalSortedBurstTime;
//     LinkedList<String> FinalSortedProcessIDs;
//     LinkedList<Integer> CompletionTime;
//     LinkedList<Integer> TurnAroundTime;
//     LinkedList<Integer> WaitingTime;



//     void FCFS_Algorithm_driver(ArrayList Temp_Arrival_List, ArrayList Temp_Burst_List, int SIZE) {

//         ProcessIDs = new ArrayList<>();
//         ArrivalTime = new ArrayList<>(Temp_Arrival_List);
//         BurstTime = new ArrayList<>(Temp_Burst_List);

//         for (int i = 0; i < SIZE; i++) {
//             ProcessIDs.add("P " + Integer.toString(i + 1));
//         }

//         DisposalProcessIDs = new ArrayList<>(ProcessIDs);
//         DisposalArrivalTime = new ArrayList<>(ArrivalTime);
//         DisposalBurstTime = new ArrayList<>(BurstTime);
//         FinalProcessID = new LinkedList<>();
//         FinalArrivalTime = new LinkedList<>();
//         FinalBurstTime = new LinkedList<>();
//         CompletionTime = new LinkedList<>();
//         TurnAroundTime = new LinkedList<>();
//         WaitingTime = new LinkedList<>();


//         while (!DisposalArrivalTime.isEmpty()) {
//             int TMP_MIN_Arrival = DisposalArrivalTime.get(0);
//             int TMP_MIN_Burst = DisposalBurstTime.get(0);
//             String TMP_MIN_PID = DisposalProcessIDs.get(0);
//             int INDEX = 0;

//             for (int i = 0; i < DisposalArrivalTime.size(); i++) {
//                 if (TMP_MIN_Arrival > DisposalArrivalTime.get(i)) {
//                     TMP_MIN_Arrival = DisposalArrivalTime.get(i);
//                     TMP_MIN_Burst = DisposalBurstTime.get(i);
//                     TMP_MIN_PID = DisposalProcessIDs.get(i);
//                     INDEX = i;
//                 }
//             }

//             FinalArrivalTime.addLast(TMP_MIN_Arrival);
//             FinalBurstTime.addLast(TMP_MIN_Burst);
//             FinalProcessID.addLast(TMP_MIN_PID);
//             DisposalArrivalTime.remove(INDEX);
//             DisposalBurstTime.remove(INDEX);
//             DisposalProcessIDs.remove(INDEX);
//         }

//         FinalSortedArrivalTime = new LinkedList<>(FinalArrivalTime);
//         FinalSortedBurstTime = new LinkedList<>(FinalBurstTime);
//         FinalSortedProcessIDs = new LinkedList<>(FinalProcessID);

//         int Completion_Time = 0;
//         boolean Passer = true;
//         while (!FinalArrivalTime.isEmpty()) {

//             if (Completion_Time < FinalArrivalTime.getFirst()) {
//                 Completion_Time++;
//             } else {
//                 if (Passer) {
//                     Completion_Time = Completion_Time + FinalBurstTime.getFirst();
//                     CompletionTime.addLast(Completion_Time);
//                     Passer = false;
//                     FinalArrivalTime.removeFirst();
//                     FinalBurstTime.removeFirst();
//                     FinalProcessID.removeFirst();
//                 } else {
//                     Completion_Time = Completion_Time + FinalBurstTime.getFirst();
//                     CompletionTime.addLast(Completion_Time);
//                     FinalArrivalTime.removeFirst();
//                     FinalBurstTime.removeFirst();
//                     FinalProcessID.removeFirst();
//                 }
//             }
//         }

//         for (int i = 0; i < FinalSortedProcessIDs.size(); i++) {
//             TurnAroundTime.add(i, CompletionTime.get(i) - FinalSortedArrivalTime.get(i));
//             WaitingTime.add(i, TurnAroundTime.get(i) - FinalSortedBurstTime.get(i));
//         }

//         System.out.println(FinalSortedProcessIDs);
//         System.out.println(FinalSortedArrivalTime);
//         System.out.println(FinalSortedBurstTime);
//         System.out.println(CompletionTime);
//         System.out.println(TurnAroundTime);
//         System.out.println(WaitingTime);
//     }

// }

// class SJF_Algorithm {
//     ArrayList<String> OrgProcessID;
//     ArrayList<Integer> OriginalArrivalTime;
//     ArrayList<Integer> OriginalBurstTime;
//     ArrayList<String> DuplicateProcessID;
//     ArrayList<Integer> DuplicateArrivalTime;
//     ArrayList<Integer> DuplicateBurstTime;
//     LinkedList<String> ProcessID_ll;
//     LinkedList<Integer> ArrivalTime_ll;
//     LinkedList<Integer> BurstTime_ll;
//     LinkedList<Integer> CompletionTime_ll;
//     LinkedList<Integer> TurnAroundTime_ll;
//     LinkedList<Integer> WaitingTime_ll;

//     void SJF_Algorithm_driver(ArrayList local_SJF_arrival , ArrayList local_SJF_burst , int SJF_SIZE)
//     {
//         OrgProcessID = new ArrayList<>();
//         OriginalArrivalTime = new ArrayList<>(local_SJF_arrival);
//         OriginalBurstTime = new ArrayList<>(local_SJF_burst);

//         for(int i=0; i<SJF_SIZE; i++)
//         {
//             OrgProcessID.add("P "+ Integer.toString(i+1));
//         }

//         DuplicateArrivalTime = new ArrayList<>(OriginalArrivalTime);
//         DuplicateBurstTime = new ArrayList<>(OriginalBurstTime);
//         DuplicateProcessID = new ArrayList<>(OrgProcessID);
//         BurstTime_ll = new LinkedList<>();
//         ArrivalTime_ll = new LinkedList<>();
//         ProcessID_ll = new LinkedList<>();
//         CompletionTime_ll = new LinkedList<>();
//         TurnAroundTime_ll = new LinkedList<>();
//         WaitingTime_ll = new LinkedList<>();

//         int CHECKPOINT =0 ; /* outside the loop */
//         int EXTENDER = 0;
//         int MINIMUM = DuplicateArrivalTime.get(0);
//         int INDEX = 0;
//         int MINIMUM_BurstTime;
//         int INDEX_BurstTime;

//         while(DuplicateProcessID.size() != 0 && DuplicateArrivalTime.size() != 0 && DuplicateBurstTime.size() != 0)
//         {
//             if(CHECKPOINT == 0)
//             {
//                 for(int i=0; i<DuplicateArrivalTime.size();i++)
//                 {
//                     if(MINIMUM > DuplicateArrivalTime.get(i))
//                     {
//                         MINIMUM = DuplicateArrivalTime.get(i);
//                         INDEX = i;
//                     }
//                 }

//                 BurstTime_ll.addLast(DuplicateBurstTime.get(INDEX));
//                 ProcessID_ll.addLast(DuplicateProcessID.get(INDEX));
//                 ArrivalTime_ll.addLast(DuplicateArrivalTime.get(INDEX));


//                 EXTENDER = DuplicateArrivalTime.get(INDEX) + DuplicateBurstTime.get(INDEX);
//                 CompletionTime_ll.addLast(EXTENDER);
//                 CHECKPOINT++;

//                 DuplicateBurstTime.remove(INDEX);
//                 DuplicateArrivalTime.remove(INDEX);
//                 DuplicateProcessID.remove(INDEX);
//             }

//             else{
//                 MINIMUM_BurstTime = DuplicateBurstTime.get(0);
//                 INDEX_BurstTime = 0;
//                 for(int i=0;  i<DuplicateArrivalTime.size(); i++)
//                 {
//                     if(EXTENDER >= DuplicateArrivalTime.get(i))
//                     {
//                         if( MINIMUM_BurstTime > DuplicateBurstTime.get(i))
//                         {
//                             MINIMUM_BurstTime = DuplicateBurstTime.get(i);
//                             INDEX_BurstTime = i;
//                         }
//                     }
//                 }

//                 BurstTime_ll.addLast(DuplicateBurstTime.get(INDEX_BurstTime));
//                 ProcessID_ll.addLast(DuplicateProcessID.get(INDEX_BurstTime));
//                 ArrivalTime_ll.addLast(DuplicateArrivalTime.get(INDEX_BurstTime));

//                 CHECKPOINT++;
//                 EXTENDER = EXTENDER + BurstTime_ll.getLast();
//                 CompletionTime_ll.addLast(EXTENDER);

//                 DuplicateProcessID.remove(INDEX_BurstTime);
//                 DuplicateBurstTime.remove(INDEX_BurstTime);
//                 DuplicateArrivalTime.remove(INDEX_BurstTime);
//             }

//         }

//         for(int i=0; i<CompletionTime_ll.size(); i++)
//         {
//             TurnAroundTime_ll.addLast(CompletionTime_ll.get(i) - ArrivalTime_ll.get(i));
//         }

//         for(int i=0; i<TurnAroundTime_ll.size(); i++)
//         {
//             WaitingTime_ll.addLast(TurnAroundTime_ll.get(i) - BurstTime_ll.get(i));
//         }

//         System.out.println(ProcessID_ll);
//         System.out.println(BurstTime_ll);
//         System.out.println(ArrivalTime_ll);
//         System.out.println(CompletionTime_ll);
//         System.out.println(TurnAroundTime_ll);
//         System.out.println(WaitingTime_ll);
//     }

// }

// class SRTF_Algorithm {

//     ArrayList<String> SRTF_OrgProcessID;
//     ArrayList<Integer> SRTF_OrgArrivalTime;
//     ArrayList<Integer> SRTF_OrgBurstTime;

//     ArrayList<String> DuplicateSRTF_ProcessID;
//     ArrayList<Integer> DuplicateSRTF_ArrivalTime;
//     ArrayList<Integer> DuplicateSRTF_BurstTime;
//     ArrayList<Integer> ReferencedSRTF_BurstTime;


//     LinkedList<Integer> SRTF_Completion_ll;
//     LinkedList<Integer> SRTF_TurnAroundTime_ll;
//     LinkedList<Integer> SRTF_WaitingTime_ll;
//     LinkedList<Integer> Process_Saver_ll;

//     void SRTF_Algorithm_driver(ArrayList local_SRTF_arrival_time , ArrayList local_SRTF_burst_time , int SRTF_SIZE)
//     {
//         SRTF_OrgProcessID = new ArrayList<>();
//         SRTF_OrgArrivalTime = new ArrayList<>(local_SRTF_arrival_time);
//         SRTF_OrgBurstTime = new ArrayList<>(local_SRTF_burst_time);
//         ReferencedSRTF_BurstTime = new ArrayList<>();

//         for(int i=0 ; i<SRTF_SIZE; i++)
//         {
//             ReferencedSRTF_BurstTime.add(i,0);
//         }
//         for(int i=0; i<SRTF_SIZE; i++)
//         {
//             SRTF_OrgProcessID.add("P "+ Integer.toString(i+1));
//         }


//         DuplicateSRTF_ProcessID = new ArrayList<>(SRTF_OrgProcessID);
//         DuplicateSRTF_ArrivalTime = new ArrayList<>(SRTF_OrgArrivalTime);
//         DuplicateSRTF_BurstTime = new ArrayList<>(SRTF_OrgBurstTime);
//         SRTF_Completion_ll = new LinkedList<>(SRTF_OrgBurstTime);
//         SRTF_TurnAroundTime_ll = new LinkedList<>();
//         SRTF_WaitingTime_ll = new LinkedList<>();
//         Process_Saver_ll = new LinkedList<>();

//         int MIN_ArrTime = DuplicateSRTF_ArrivalTime.get(0);
//         int CURRENT_INDEX = 0;
//         int CURRENT_TIME;
//         int CURRENT_BURST_TIME;
//         int EXTENDER;

//         for(int i=0 ; i<SRTF_SIZE; i++)
//         {
//             if(MIN_ArrTime > DuplicateSRTF_ArrivalTime.get(i))
//             {
//                 MIN_ArrTime = DuplicateSRTF_ArrivalTime.get(i);
//                 CURRENT_INDEX = i;
//             }
//         }

//         CURRENT_TIME = DuplicateSRTF_ArrivalTime.get(CURRENT_INDEX);
//         CURRENT_BURST_TIME = DuplicateSRTF_BurstTime.get(CURRENT_INDEX);

//         while( !DuplicateSRTF_BurstTime.equals(ReferencedSRTF_BurstTime))
//         {
//             CURRENT_TIME++;
//             CURRENT_BURST_TIME --;

//             if(CURRENT_BURST_TIME == 0 && Process_Saver_ll.isEmpty())
//             {
//                 SRTF_Completion_ll.set(CURRENT_INDEX,CURRENT_TIME);
//             }

//             if(CURRENT_BURST_TIME ==0 && !Process_Saver_ll.isEmpty())
//             {
//                 DuplicateSRTF_BurstTime.set(CURRENT_INDEX,CURRENT_BURST_TIME);
//                 SRTF_Completion_ll.set(CURRENT_INDEX,CURRENT_TIME);
//                 CURRENT_BURST_TIME  = DuplicateSRTF_BurstTime.get(Process_Saver_ll.getFirst());
//                 CURRENT_INDEX = Process_Saver_ll.getFirst();
//                 Process_Saver_ll.removeFirst();
//             }

//             DuplicateSRTF_BurstTime.set(CURRENT_INDEX , CURRENT_BURST_TIME);
//             EXTENDER = CURRENT_TIME + 1;


//             for(int i=0; i<DuplicateSRTF_BurstTime.size(); i++)
//             {
//                 if(EXTENDER > DuplicateSRTF_ArrivalTime.get(i) && DuplicateSRTF_ArrivalTime.get(i) >= CURRENT_TIME )
//                 {
//                     if(DuplicateSRTF_BurstTime.get(i) < CURRENT_BURST_TIME)
//                     {
//                         Process_Saver_ll.addFirst(CURRENT_INDEX);
//                         CURRENT_BURST_TIME = DuplicateSRTF_BurstTime.get(i);
//                         CURRENT_INDEX = i;
//                     }

//                     else {
//                         boolean flag = false;
//                         for(int j=0; j<Process_Saver_ll.size(); j++)
//                         {

//                             if(Process_Saver_ll.get(j) == i)
//                             {
//                                 flag = true;
//                             }
//                         }
//                         if(flag == false)
//                         {
//                             Process_Saver_ll.addFirst(i);
//                         }

//                     }

//                 }
//             }

//         }
//         for(int i=0 ; i<SRTF_Completion_ll.size(); i++)
//         {
//             SRTF_TurnAroundTime_ll.addLast(SRTF_Completion_ll.get(i) - SRTF_OrgArrivalTime.get(i));
//         }

//         for(int i=0; i<SRTF_TurnAroundTime_ll.size(); i++)
//         {
//             SRTF_WaitingTime_ll.addLast(SRTF_TurnAroundTime_ll.get(i) - SRTF_OrgBurstTime.get(i));
//         }
//         System.out.println(SRTF_OrgProcessID);
//         System.out.println(SRTF_OrgArrivalTime);
//         System.out.println(SRTF_OrgBurstTime);
//         System.out.println(SRTF_Completion_ll);
//         System.out.println(SRTF_TurnAroundTime_ll);
//         System.out.println(SRTF_WaitingTime_ll);
//     }
    
// }

// public class operatingsystemproject{
//     JFrame FoundationFrame;
//     JPanel Panel;
//     JComboBox Obj;
//     JLabel Heading;
//     JLabel Arrival_TimesGUI;
//     JLabel Burst_TimesGUI;
//     JTextField Arrival_TimesGUI_Field;
//     JTextField Burst_TimesGUI_Field;
//     JButton Ok;


//      operatingsystemproject()
//     {

//         FoundationFrame = new JFrame("Subham Sharma_1000015301");
//         FoundationFrame.setSize(800,800);
//         FoundationFrame.setLayout(null);

//         Panel = new JPanel();
//         Panel.setBounds(200,200,350,300);
//         Panel.setLayout(new GridLayout(7,1,0,15));


//         String names [] = {"FCFS (First Come First Serve)","SJF (Shortest Job First)","SRTF (Shortest Remaining Time First)"};
//         Obj = new JComboBox(names);
//         Obj.setFont(new Font("Sans Serif",Font.BOLD,16));
//         Obj.setForeground(Color.BLACK);

//         Heading = new JLabel("Select any Algorithm");
//         Heading.setFont(new Font("Serif" , Font.BOLD , 24));
//         Heading.setForeground(Color.BLUE);

//         Arrival_TimesGUI = new JLabel("Arrival Times");
//         Arrival_TimesGUI.setFont(new Font("Serif" , Font.BOLD , 20));
//         Arrival_TimesGUI.setForeground(Color.BLUE);

//         Burst_TimesGUI = new JLabel("Burst Times");
//         Burst_TimesGUI.setFont(new Font("Serif" , Font.BOLD , 20));
//         Burst_TimesGUI.setForeground(Color.BLUE);

//         Arrival_TimesGUI_Field = new JTextField();
//         Burst_TimesGUI_Field = new JTextField();

//         Ok = new JButton("SUBMIT");
//         Ok.setBackground(Color.pink);
//         Ok.setForeground(Color.black);


//         Panel.add(Heading);
//         Panel.add(Obj);
//         Panel.add(Arrival_TimesGUI);
//         Panel.add(Arrival_TimesGUI_Field);
//         Panel.add(Burst_TimesGUI);
//         Panel.add(Burst_TimesGUI_Field);
//         Panel.add(Ok);
//         FoundationFrame.add(Panel);

//         FoundationFrame.setLayout(null);
//         FoundationFrame.setVisible(true);
//         FoundationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         Ok.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 if(e.getSource() == Ok)
//                 {
//                     boolean passer = true;
//                     int choice = Obj.getSelectedIndex();
//                     String column [] ={"Process_ID" , "Arrival_Time", "Burst_Time","Completion_Time","TurnAround_Time","Waiting_Time"};
//                     String data[][];

//                     String Arrival_str = Arrival_TimesGUI_Field.getText();
//                     String Burst_str = Burst_TimesGUI_Field.getText();

//                     String Temporary_Transfer_Arrival_ArrayString [] = Arrival_str.split("\\s");
//                     String Temporary_Transfer_Burst_ArrayString [] = Burst_str.split("\\s");

//                     if(Arrival_str.isEmpty() || Burst_str.isEmpty() || (Arrival_str.isEmpty() && Burst_str.isEmpty()))
//                     {
//                         JOptionPane.showMessageDialog(FoundationFrame , "Mention the Arrival times or Burst times or both!!!");
//                         passer =  false;
//                     }

//                     if(Arrival_str.length() != Burst_str.length())
//                     {
//                         JOptionPane.showMessageDialog(FoundationFrame,"Arrival times and Burst Times should be equal");
//                         passer = false;
//                     }

//                     ArrayList<Integer> Temporary_ArrivalList = new ArrayList<>();
//                     ArrayList<Integer> Temporary_BurstList = new ArrayList<>();


//                     try
//                     {
//                         for(int i=0 ; i<Temporary_Transfer_Arrival_ArrayString.length ; i++)
//                         {
//                             Temporary_ArrivalList.add(Integer.parseInt(Temporary_Transfer_Arrival_ArrayString[i]));
//                             Temporary_BurstList.add(Integer.parseInt(Temporary_Transfer_Burst_ArrayString[i]));
//                         }

//                     }
//                   catch(Exception exception)
//                   {
//                       JOptionPane.showMessageDialog(FoundationFrame,"Arrival times and Burst times should be same");
//                       passer = false;
//                   }

//                     if(passer)
//                     {
//                         double sum_tat = 0;
//                         double sum_wt = 0 ;
//                         double avg_tat;
//                         double avg_wt;

//                        if(choice == 0)
//                        {
//                            data = new String[Temporary_ArrivalList.size()+1][6];
//                            FCFS_Algorithm OBJ_FCFS = new FCFS_Algorithm();
//                            OBJ_FCFS.FCFS_Algorithm_driver(Temporary_ArrivalList ,Temporary_BurstList , Temporary_ArrivalList.size());

//                            for(int i=0; i<Temporary_ArrivalList.size();i++)
//                            {
//                                    data[i][0] = OBJ_FCFS.FinalSortedProcessIDs.get(i);
//                                    data[i][1] = String.valueOf(OBJ_FCFS.FinalSortedArrivalTime.get(i));
//                                    data[i][2] = String.valueOf(OBJ_FCFS.FinalSortedBurstTime.get(i));
//                                    data[i][3] = String.valueOf(OBJ_FCFS.CompletionTime.get(i));
//                                    data[i][4]  = String.valueOf(OBJ_FCFS.TurnAroundTime.get(i));
//                                    data[i][5] = String.valueOf(OBJ_FCFS.WaitingTime.get(i));

//                                    sum_tat = sum_tat + OBJ_FCFS.TurnAroundTime.get(i);
//                                    sum_wt = sum_wt + OBJ_FCFS.WaitingTime.get(i);

//                            }
//                            avg_tat = sum_tat/Temporary_ArrivalList.size();
//                            avg_wt = sum_wt/Temporary_ArrivalList.size();

//                            data[Temporary_ArrivalList.size()][4] = "Avg: "+avg_tat;
//                            data[Temporary_ArrivalList.size()][5] = "Avg: "+avg_wt;

//                            JFrame FCFS_frame = new JFrame("Subham Sharma_1000015301");
//                            FCFS_frame.setSize(700,200);

//                            JTable FCFS_table = new JTable(data,column);
//                            JScrollPane FCFS_SP = new JScrollPane(FCFS_table);
//                            FCFS_frame.add(FCFS_SP);
//                            FCFS_frame.setVisible(true);
//                            FCFS_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                        }

//                        if(choice == 1)
//                        {
//                            data = new String[Temporary_ArrivalList.size()+1][6];
//                            SJF_Algorithm OBJ_SJF = new SJF_Algorithm();
//                            OBJ_SJF.SJF_Algorithm_driver(Temporary_ArrivalList, Temporary_BurstList , Temporary_ArrivalList.size());

//                            for(int i=0; i<Temporary_ArrivalList.size();i++)
//                            {
//                                data[i][0] = OBJ_SJF.ProcessID_ll.get(i);
//                                data[i][1] = String.valueOf(OBJ_SJF.ArrivalTime_ll.get(i));
//                                data[i][2] = String.valueOf(OBJ_SJF.BurstTime_ll.get(i));
//                                data[i][3] = String.valueOf(OBJ_SJF.CompletionTime_ll.get(i));
//                                data[i][4]  = String.valueOf(OBJ_SJF.TurnAroundTime_ll.get(i));
//                                data[i][5] = String.valueOf(OBJ_SJF.WaitingTime_ll.get(i));

//                                sum_tat = sum_tat + OBJ_SJF.TurnAroundTime_ll.get(i);
//                                sum_wt = sum_wt + OBJ_SJF.WaitingTime_ll.get(i);
//                            }

//                            avg_tat = sum_tat/Temporary_ArrivalList.size();
//                            avg_wt = sum_wt/Temporary_ArrivalList.size();

//                            data[Temporary_ArrivalList.size()][4] = "Avg: "+avg_tat;
//                            data[Temporary_ArrivalList.size()][5] = "Avg: "+avg_wt;

//                            JFrame SJF_frame = new JFrame("Subham Sharma_1000015301");
//                            SJF_frame.setSize(700,200);
//                            JTable SJF_table = new JTable(data,column);
//                            JScrollPane SJF_SP = new JScrollPane(SJF_table);
//                            SJF_frame.add(SJF_SP);
//                            SJF_frame.setVisible(true);
//                            SJF_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//                        }

//                        if(choice == 2)
//                        {
//                            data = new String[Temporary_ArrivalList.size()+1][6];
//                            SRTF_Algorithm OBJ_SRTF = new SRTF_Algorithm();
//                            OBJ_SRTF.SRTF_Algorithm_driver(Temporary_ArrivalList,Temporary_BurstList , Temporary_ArrivalList.size());

//                            for(int i=0; i<Temporary_ArrivalList.size();i++)
//                            {
//                                data[i][0] = OBJ_SRTF.SRTF_OrgProcessID.get(i);
//                                data[i][1] = String.valueOf(OBJ_SRTF.SRTF_OrgArrivalTime.get(i));
//                                data[i][2] = String.valueOf(OBJ_SRTF.SRTF_OrgBurstTime.get(i));
//                                data[i][3] = String.valueOf(OBJ_SRTF.SRTF_Completion_ll.get(i));
//                                data[i][4]  = String.valueOf(OBJ_SRTF.SRTF_TurnAroundTime_ll.get(i));
//                                data[i][5] = String.valueOf(OBJ_SRTF.SRTF_WaitingTime_ll.get(i));

//                                sum_tat = sum_tat + OBJ_SRTF.SRTF_TurnAroundTime_ll.get(i);
//                                sum_wt = sum_wt + OBJ_SRTF.SRTF_WaitingTime_ll.get(i);
//                            }

//                            avg_tat = sum_tat/Temporary_ArrivalList.size();
//                            avg_wt = sum_wt/Temporary_ArrivalList.size();

//                            data[Temporary_ArrivalList.size()][4] = "Avg: "+avg_tat;
//                            data[Temporary_ArrivalList.size()][5] = "Avg: "+avg_wt;

//                            JFrame SRTF_frame = new JFrame("Subham Sharma_1000015301");
//                            SRTF_frame.setSize(700,200);
//                            JTable FCFS_table = new JTable(data,column);
//                            JScrollPane SRTF_SP = new JScrollPane(FCFS_table);
//                            SRTF_frame.add(SRTF_SP);
//                            SRTF_frame.setVisible(true);
//                            SRTF_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                        }
//                     }
//                 }
//             }
//         });

//     }

//     public static void main(String[] args) {
//         new  operatingsystemproject();
//     }
// }