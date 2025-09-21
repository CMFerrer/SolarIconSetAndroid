package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(
            name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(16.4746f, 4.3748f)
                lineTo(19.6474f, 7.5508f)
                curveTo(20.6549f, 8.5592f, 21.4713f, 9.3765f, 21.9969f, 10.0857f)
                curveTo(22.5382f, 10.8162f, 22.8881f, 11.5854f, 22.6982f, 12.4634f)
                curveTo(22.5083f, 13.3416f, 21.8718f, 13.8972f, 21.0771f, 14.3384f)
                curveTo(20.3055f, 14.7666f, 19.2245f, 15.1727f, 17.8906f, 15.6739f)
                lineTo(15.9136f, 16.4167f)
                curveTo(15.1192f, 16.7151f, 14.9028f, 16.8081f, 14.742f, 16.9474f)
                curveTo(14.6611f, 17.0175f, 14.5887f, 17.0968f, 14.5263f, 17.1838f)
                curveTo(14.4021f, 17.3569f, 14.329f, 17.5813f, 14.1037f, 18.4001f)
                lineTo(14.0914f, 18.445f)
                curveTo(13.8627f, 19.2763f, 13.6739f, 19.9624f, 13.4671f, 20.4775f)
                curveTo(13.2573f, 21.0003f, 12.974f, 21.4956f, 12.465f, 21.7861f)
                curveTo(12.1114f, 21.9878f, 11.7112f, 22.0937f, 11.3041f, 22.0931f)
                curveTo(10.7179f, 22.0922f, 10.227f, 21.8015f, 9.7865f, 21.4506f)
                curveTo(9.3524f, 21.1049f, 8.8497f, 20.6016f, 8.2407f, 19.992f)
                lineTo(6.6534f, 18.4031f)
                lineTo(2.5306f, 22.53f)
                curveTo(2.2379f, 22.8231f, 1.763f, 22.8233f, 1.4699f, 22.5306f)
                curveTo(1.1769f, 22.2378f, 1.1767f, 21.763f, 1.4694f, 21.4699f)
                lineTo(5.5933f, 17.3419f)
                lineTo(4.0584f, 15.8055f)
                curveTo(3.4532f, 15.1996f, 2.9536f, 14.6996f, 2.61f, 14.2679f)
                curveTo(2.2613f, 13.8297f, 1.9721f, 13.3421f, 1.9685f, 12.7599f)
                curveTo(1.9659f, 12.3452f, 2.0735f, 11.9372f, 2.2805f, 11.5778f)
                curveTo(2.5712f, 11.0731f, 3.0634f, 10.792f, 3.583f, 10.5834f)
                curveTo(4.0948f, 10.378f, 4.776f, 10.1902f, 5.6011f, 9.9627f)
                lineTo(5.6457f, 9.9504f)
                curveTo(6.466f, 9.7243f, 6.6905f, 9.6509f, 6.8635f, 9.5264f)
                curveTo(6.9526f, 9.4623f, 7.0337f, 9.3876f, 7.105f, 9.3039f)
                curveTo(7.2434f, 9.1415f, 7.335f, 8.9233f, 7.628f, 8.1237f)
                lineTo(8.3445f, 6.1682f)
                curveTo(8.8387f, 4.8191f, 9.2391f, 3.7264f, 9.6636f, 2.9462f)
                curveTo(10.1005f, 2.1433f, 10.654f, 1.4982f, 11.5357f, 1.3037f)
                curveTo(12.4175f, 1.1091f, 13.1908f, 1.4616f, 13.9246f, 2.0064f)
                curveTo(14.6375f, 2.5357f, 15.4597f, 3.3587f, 16.4746f, 4.3748f)
                close()
                moveTo(13.0304f, 3.2107f)
                curveTo(12.4277f, 2.7633f, 12.1086f, 2.7133f, 11.8588f, 2.7684f)
                curveTo(11.609f, 2.8235f, 11.3402f, 3.0034f, 10.9812f, 3.6631f)
                curveTo(10.6161f, 4.334f, 10.2525f, 5.3207f, 9.7309f, 6.7444f)
                lineTo(9.0364f, 8.6398f)
                curveTo(9.023f, 8.6763f, 9.0099f, 8.7123f, 8.9969f, 8.7479f)
                curveTo(8.7627f, 9.3887f, 8.5818f, 9.8836f, 8.2466f, 10.2768f)
                curveTo(8.0971f, 10.4523f, 7.927f, 10.6091f, 7.7399f, 10.7438f)
                curveTo(7.3205f, 11.0457f, 6.8126f, 11.1853f, 6.1554f, 11.3659f)
                curveTo(6.1188f, 11.376f, 6.0818f, 11.3861f, 6.0444f, 11.3965f)
                curveTo(5.1634f, 11.6394f, 4.5652f, 11.8055f, 4.1418f, 11.9754f)
                curveTo(3.7169f, 12.146f, 3.615f, 12.2662f, 3.5804f, 12.3264f)
                curveTo(3.5062f, 12.4552f, 3.4675f, 12.6016f, 3.4685f, 12.7505f)
                curveTo(3.4689f, 12.8201f, 3.4983f, 12.9753f, 3.7837f, 13.3338f)
                curveTo(4.068f, 13.691f, 4.5061f, 14.1312f, 5.1523f, 14.778f)
                lineTo(9.269f, 18.8989f)
                curveTo(9.9192f, 19.5498f, 10.3618f, 19.9912f, 10.721f, 20.2773f)
                curveTo(11.0814f, 20.5644f, 11.2369f, 20.593f, 11.3064f, 20.5931f)
                curveTo(11.4519f, 20.5933f, 11.595f, 20.5555f, 11.7215f, 20.4833f)
                curveTo(11.7821f, 20.4487f, 11.9033f, 20.3466f, 12.0751f, 19.9187f)
                curveTo(12.2462f, 19.4923f, 12.4133f, 18.8896f, 12.6574f, 18.0022f)
                curveTo(12.6677f, 17.9648f, 12.6778f, 17.9279f, 12.6878f, 17.8915f)
                curveTo(12.8678f, 17.2353f, 13.0069f, 16.7284f, 13.3075f, 16.3093f)
                curveTo(13.4384f, 16.1269f, 13.5903f, 15.9605f, 13.76f, 15.8135f)
                curveTo(14.15f, 15.4758f, 14.642f, 15.2914f, 15.2786f, 15.0528f)
                curveTo(15.314f, 15.0396f, 15.3498f, 15.0261f, 15.386f, 15.0125f)
                lineTo(17.3032f, 14.2922f)
                curveTo(18.7112f, 13.7632f, 19.6865f, 13.3946f, 20.3491f, 13.0268f)
                curveTo(21.0001f, 12.6655f, 21.178f, 12.3968f, 21.2321f, 12.1464f)
                curveTo(21.2863f, 11.8959f, 21.2353f, 11.5773f, 20.7917f, 10.9788f)
                curveTo(20.3403f, 10.3695f, 19.6045f, 9.6302f, 18.541f, 8.5657f)
                lineTo(15.4588f, 5.4802f)
                curveTo(14.3876f, 4.408f, 13.6433f, 3.6658f, 13.0304f, 3.2107f)
                close()
            }
        }
            .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
