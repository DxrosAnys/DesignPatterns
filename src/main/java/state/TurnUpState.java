//package state;
//
//public class TurnUpState implements State{
//
//    @Override
//    public void turnUp(Fan fan) {
//
//    }
//
//    @Override
//    public void turnDown(Fan fan) {
//        fan.setTurnState(new TurnUpState());
//        switch (fan.getState()) {
//            case "medium":
//                fan.setTurnState(new TurnDownState());
//                fan.setState("low");
//                System.out.println("Fan is on low");
//                break;
//            case "high":
//                fan.setState("medium");
//                System.out.println("Fan is on medium");
//        }
//    }
//}
