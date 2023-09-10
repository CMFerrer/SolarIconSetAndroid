package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

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
                pathFillType = NonZero
            ) {
                moveTo(15.9894f, 4.9502f)
                lineTo(16.52f, 4.4201f)
                lineTo(16.52f, 4.4201f)
                lineTo(15.9894f, 4.9502f)
                close()
                moveTo(19.0716f, 8.0356f)
                lineTo(18.541f, 8.5657f)
                lineTo(18.541f, 8.5657f)
                lineTo(19.0716f, 8.0356f)
                close()
                moveTo(8.7384f, 19.429f)
                lineTo(8.2078f, 19.9591f)
                lineTo(8.2078f, 19.9591f)
                lineTo(8.7384f, 19.429f)
                close()
                moveTo(4.6217f, 15.3081f)
                lineTo(5.1523f, 14.7781f)
                lineTo(5.1523f, 14.7781f)
                lineTo(4.6217f, 15.3081f)
                close()
                moveTo(17.5669f, 14.9943f)
                lineTo(17.3032f, 14.2922f)
                lineTo(17.3032f, 14.2922f)
                lineTo(17.5669f, 14.9943f)
                close()
                moveTo(15.6498f, 15.7146f)
                lineTo(15.9136f, 16.4167f)
                lineTo(15.9136f, 16.4167f)
                lineTo(15.6498f, 15.7146f)
                close()
                moveTo(8.3322f, 8.3818f)
                lineTo(7.628f, 8.1237f)
                lineTo(7.628f, 8.1237f)
                lineTo(8.3322f, 8.3818f)
                close()
                moveTo(9.0267f, 6.4864f)
                lineTo(9.7309f, 6.7444f)
                lineTo(9.7309f, 6.7444f)
                lineTo(9.0267f, 6.4864f)
                close()
                moveTo(5.845f, 10.6735f)
                lineTo(6.0444f, 11.3965f)
                lineTo(6.0444f, 11.3965f)
                lineTo(5.845f, 10.6735f)
                close()
                moveTo(7.3017f, 10.1351f)
                lineTo(6.8635f, 9.5265f)
                lineTo(6.8635f, 9.5265f)
                lineTo(7.3017f, 10.1351f)
                close()
                moveTo(7.6758f, 9.7904f)
                lineTo(8.2466f, 10.2768f)
                lineTo(8.2466f, 10.2768f)
                lineTo(7.6758f, 9.7904f)
                close()
                moveTo(14.251f, 16.3805f)
                lineTo(14.742f, 16.9475f)
                lineTo(14.742f, 16.9475f)
                lineTo(14.251f, 16.3805f)
                close()
                moveTo(13.3806f, 18.2012f)
                lineTo(12.6574f, 18.0022f)
                lineTo(12.6574f, 18.0022f)
                lineTo(13.3806f, 18.2012f)
                close()
                moveTo(13.9169f, 16.7466f)
                lineTo(13.3075f, 16.3094f)
                lineTo(13.3075f, 16.3094f)
                lineTo(13.9169f, 16.7466f)
                close()
                moveTo(2.7185f, 12.7552f)
                lineTo(1.9685f, 12.76f)
                lineTo(1.9685f, 12.76f)
                lineTo(2.7185f, 12.7552f)
                close()
                moveTo(2.9304f, 11.9521f)
                lineTo(2.2805f, 11.5778f)
                lineTo(2.2805f, 11.5778f)
                lineTo(2.9304f, 11.9521f)
                close()
                moveTo(11.3052f, 21.3431f)
                lineTo(11.3064f, 20.5931f)
                lineTo(11.3064f, 20.5931f)
                lineTo(11.3052f, 21.3431f)
                close()
                moveTo(12.0933f, 21.1347f)
                lineTo(11.7215f, 20.4833f)
                lineTo(11.7215f, 20.4833f)
                lineTo(12.0933f, 21.1347f)
                close()
                moveTo(11.6973f, 2.0361f)
                lineTo(11.8588f, 2.7685f)
                lineTo(11.8588f, 2.7685f)
                lineTo(11.6973f, 2.0361f)
                close()
                moveTo(1.4694f, 21.4699f)
                curveTo(1.1767f, 21.763f, 1.1769f, 22.2379f, 1.4699f, 22.5306f)
                curveTo(1.763f, 22.8233f, 2.2379f, 22.8231f, 2.5306f, 22.5301f)
                lineTo(1.4694f, 21.4699f)
                close()
                moveTo(7.1838f, 17.8721f)
                curveTo(7.4766f, 17.5791f, 7.4763f, 17.1042f, 7.1833f, 16.8114f)
                curveTo(6.8902f, 16.5187f, 6.4154f, 16.5189f, 6.1226f, 16.812f)
                lineTo(7.1838f, 17.8721f)
                close()
                moveTo(15.4588f, 5.4803f)
                lineTo(18.541f, 8.5657f)
                lineTo(19.6022f, 7.5056f)
                lineTo(16.52f, 4.4201f)
                lineTo(15.4588f, 5.4803f)
                close()
                moveTo(9.269f, 18.8989f)
                lineTo(5.1523f, 14.7781f)
                lineTo(4.0911f, 15.8382f)
                lineTo(8.2078f, 19.9591f)
                lineTo(9.269f, 18.8989f)
                close()
                moveTo(17.3032f, 14.2922f)
                lineTo(15.386f, 15.0125f)
                lineTo(15.9136f, 16.4167f)
                lineTo(17.8307f, 15.6964f)
                lineTo(17.3032f, 14.2922f)
                close()
                moveTo(9.0364f, 8.6398f)
                lineTo(9.7309f, 6.7444f)
                lineTo(8.3224f, 6.2283f)
                lineTo(7.628f, 8.1237f)
                lineTo(9.0364f, 8.6398f)
                close()
                moveTo(6.0444f, 11.3965f)
                curveTo(6.7558f, 11.2003f, 7.2972f, 11.0625f, 7.7399f, 10.7438f)
                lineTo(6.8635f, 9.5265f)
                curveTo(6.6905f, 9.651f, 6.466f, 9.7243f, 5.6457f, 9.9504f)
                lineTo(6.0444f, 11.3965f)
                close()
                moveTo(7.628f, 8.1237f)
                curveTo(7.335f, 8.9233f, 7.2434f, 9.1415f, 7.105f, 9.3039f)
                lineTo(8.2466f, 10.2768f)
                curveTo(8.6004f, 9.8617f, 8.7823f, 9.3334f, 9.0364f, 8.6398f)
                lineTo(7.628f, 8.1237f)
                close()
                moveTo(7.7399f, 10.7438f)
                curveTo(7.927f, 10.6091f, 8.0971f, 10.4523f, 8.2466f, 10.2768f)
                lineTo(7.105f, 9.3039f)
                curveTo(7.0337f, 9.3876f, 6.9526f, 9.4623f, 6.8635f, 9.5265f)
                lineTo(7.7399f, 10.7438f)
                close()
                moveTo(15.386f, 15.0125f)
                curveTo(14.697f, 15.2714f, 14.1716f, 15.4571f, 13.76f, 15.8135f)
                lineTo(14.742f, 16.9475f)
                curveTo(14.9028f, 16.8082f, 15.1192f, 16.7152f, 15.9136f, 16.4167f)
                lineTo(15.386f, 15.0125f)
                close()
                moveTo(14.1037f, 18.4001f)
                curveTo(14.329f, 17.5813f, 14.4021f, 17.3569f, 14.5263f, 17.1838f)
                lineTo(13.3075f, 16.3094f)
                curveTo(12.9902f, 16.7517f, 12.8529f, 17.2919f, 12.6574f, 18.0022f)
                lineTo(14.1037f, 18.4001f)
                close()
                moveTo(13.76f, 15.8135f)
                curveTo(13.5903f, 15.9605f, 13.4384f, 16.1269f, 13.3075f, 16.3094f)
                lineTo(14.5263f, 17.1838f)
                curveTo(14.5887f, 17.0968f, 14.6611f, 17.0175f, 14.742f, 16.9475f)
                lineTo(13.76f, 15.8135f)
                close()
                moveTo(5.1523f, 14.7781f)
                curveTo(4.5061f, 14.1313f, 4.068f, 13.691f, 3.7837f, 13.3338f)
                curveTo(3.4983f, 12.9753f, 3.4689f, 12.8201f, 3.4685f, 12.7505f)
                lineTo(1.9685f, 12.76f)
                curveTo(1.9721f, 13.3422f, 2.2613f, 13.8297f, 2.61f, 14.2679f)
                curveTo(2.9598f, 14.7073f, 3.4711f, 15.2176f, 4.0911f, 15.8382f)
                lineTo(5.1523f, 14.7781f)
                close()
                moveTo(5.6457f, 9.9504f)
                curveTo(4.8005f, 10.1835f, 4.104f, 10.3743f, 3.583f, 10.5835f)
                curveTo(3.0634f, 10.792f, 2.5712f, 11.0732f, 2.2805f, 11.5778f)
                lineTo(3.5804f, 12.3264f)
                curveTo(3.615f, 12.2663f, 3.7169f, 12.146f, 4.1418f, 11.9755f)
                curveTo(4.5652f, 11.8055f, 5.1634f, 11.6394f, 6.0444f, 11.3965f)
                lineTo(5.6457f, 9.9504f)
                close()
                moveTo(3.4685f, 12.7505f)
                curveTo(3.4675f, 12.6016f, 3.5062f, 12.4553f, 3.5804f, 12.3264f)
                lineTo(2.2805f, 11.5778f)
                curveTo(2.0735f, 11.9372f, 1.9659f, 12.3452f, 1.9685f, 12.76f)
                lineTo(3.4685f, 12.7505f)
                close()
                moveTo(8.2078f, 19.9591f)
                curveTo(8.8316f, 20.5836f, 9.3446f, 21.0987f, 9.7865f, 21.4506f)
                curveTo(10.227f, 21.8015f, 10.7179f, 22.0922f, 11.3041f, 22.0931f)
                lineTo(11.3064f, 20.5931f)
                curveTo(11.2369f, 20.593f, 11.0814f, 20.5644f, 10.721f, 20.2773f)
                curveTo(10.3618f, 19.9912f, 9.9192f, 19.5499f, 9.269f, 18.8989f)
                lineTo(8.2078f, 19.9591f)
                close()
                moveTo(12.6574f, 18.0022f)
                curveTo(12.4133f, 18.8897f, 12.2462f, 19.4924f, 12.0751f, 19.9188f)
                curveTo(11.9033f, 20.3467f, 11.7821f, 20.4487f, 11.7215f, 20.4833f)
                lineTo(12.465f, 21.7861f)
                curveTo(12.974f, 21.4956f, 13.2573f, 21.0004f, 13.4671f, 20.4775f)
                curveTo(13.6776f, 19.9532f, 13.8694f, 19.2516f, 14.1037f, 18.4001f)
                lineTo(12.6574f, 18.0022f)
                close()
                moveTo(11.3041f, 22.0931f)
                curveTo(11.7112f, 22.0937f, 12.1114f, 21.9879f, 12.465f, 21.7861f)
                lineTo(11.7215f, 20.4833f)
                curveTo(11.595f, 20.5555f, 11.4519f, 20.5933f, 11.3064f, 20.5931f)
                lineTo(11.3041f, 22.0931f)
                close()
                moveTo(18.541f, 8.5657f)
                curveTo(19.6045f, 9.6302f, 20.3403f, 10.3695f, 20.7917f, 10.9788f)
                curveTo(21.2353f, 11.5774f, 21.2863f, 11.8959f, 21.2321f, 12.1464f)
                lineTo(22.6982f, 12.4634f)
                curveTo(22.8881f, 11.5854f, 22.5382f, 10.8162f, 21.9969f, 10.0857f)
                curveTo(21.4635f, 9.3659f, 20.6305f, 8.5349f, 19.6022f, 7.5056f)
                lineTo(18.541f, 8.5657f)
                close()
                moveTo(17.8307f, 15.6964f)
                curveTo(19.1921f, 15.1849f, 20.294f, 14.773f, 21.0771f, 14.3384f)
                curveTo(21.8718f, 13.8973f, 22.5083f, 13.3416f, 22.6982f, 12.4634f)
                lineTo(21.2321f, 12.1464f)
                curveTo(21.178f, 12.3968f, 21.0001f, 12.6655f, 20.3491f, 13.0268f)
                curveTo(19.6865f, 13.3946f, 18.7112f, 13.7632f, 17.3032f, 14.2922f)
                lineTo(17.8307f, 15.6964f)
                close()
                moveTo(16.52f, 4.4201f)
                curveTo(15.4841f, 3.3832f, 14.6481f, 2.5435f, 13.9246f, 2.0064f)
                curveTo(13.1908f, 1.4617f, 12.4175f, 1.1091f, 11.5357f, 1.3037f)
                lineTo(11.8588f, 2.7685f)
                curveTo(12.1086f, 2.7134f, 12.4277f, 2.7633f, 13.0304f, 3.2108f)
                curveTo(13.6433f, 3.6658f, 14.3876f, 4.408f, 15.4588f, 5.4803f)
                lineTo(16.52f, 4.4201f)
                close()
                moveTo(9.7309f, 6.7444f)
                curveTo(10.2525f, 5.3208f, 10.6161f, 4.334f, 10.9812f, 3.6632f)
                curveTo(11.3402f, 3.0034f, 11.609f, 2.8236f, 11.8588f, 2.7685f)
                lineTo(11.5357f, 1.3037f)
                curveTo(10.654f, 1.4982f, 10.1005f, 2.1433f, 9.6636f, 2.9462f)
                curveTo(9.2328f, 3.7379f, 8.8269f, 4.8515f, 8.3224f, 6.2283f)
                lineTo(9.7309f, 6.7444f)
                close()
                moveTo(2.5306f, 22.5301f)
                lineTo(7.1838f, 17.8721f)
                lineTo(6.1226f, 16.812f)
                lineTo(1.4694f, 21.4699f)
                lineTo(2.5306f, 22.5301f)
                close()
            }
        }
            .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
