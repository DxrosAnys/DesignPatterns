//package behavioral.state;
//
//public class TurnDownState implements State{
//    @Override
//    public void turnUp(Fan fan) {
//        fan.setTurnState(new TurnDownState());
//        switch (fan.getState()) {
//            case "low":
//                fan.setState("medium");
//                System.out.println("Fan is on medium");
//                break;
//            case "medium":
//                fan.setTurnState(new TurnUpState());
//                fan.setState("high");
//                System.out.println("Fan is on high");
//                break;
//
//        }
//    }
//
//    @Override
//    public void turnDown(Fan fan) {
//
//    }
//}
