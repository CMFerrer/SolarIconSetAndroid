package dev.chiksmedina.solar.outline.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FilesGroup

val FilesGroup.FileCorrupted: ImageVector
    get() {
        if (_fileCorrupted != null) {
            return _fileCorrupted!!
        }
        _fileCorrupted = Builder(
            name = "FileCorrupted", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.25f, 2.8336f)
                curveTo(11.7897f, 2.7559f, 11.1621f, 2.7501f, 10.0324f, 2.7501f)
                curveTo(8.1151f, 2.7501f, 6.7523f, 2.7516f, 5.719f, 2.8899f)
                curveTo(4.7067f, 3.0253f, 4.125f, 3.2794f, 3.7022f, 3.702f)
                curveTo(3.2788f, 4.1253f, 3.0251f, 4.7049f, 2.8898f, 5.7109f)
                curveTo(2.7516f, 6.7386f, 2.75f, 8.0932f, 2.75f, 10.0001f)
                verticalLineTo(11.9397f)
                curveTo(2.75f, 12.0247f, 2.75f, 12.0794f, 2.7506f, 12.1201f)
                curveTo(2.7511f, 12.1474f, 2.7517f, 12.1594f, 2.7519f, 12.1622f)
                curveTo(2.773f, 12.3333f, 2.9578f, 12.4327f, 3.1126f, 12.355f)
                curveTo(3.115f, 12.3535f, 3.1254f, 12.3474f, 3.1484f, 12.3326f)
                curveTo(3.1826f, 12.3106f, 3.2282f, 12.2802f, 3.2989f, 12.2331f)
                curveTo(4.3296f, 11.5462f, 5.6723f, 11.5462f, 6.703f, 12.2331f)
                curveTo(7.4896f, 12.7573f, 8.5143f, 12.7573f, 9.3008f, 12.2331f)
                curveTo(10.3316f, 11.5462f, 11.6743f, 11.5462f, 12.705f, 12.2331f)
                curveTo(13.4915f, 12.7573f, 14.5163f, 12.7573f, 15.3028f, 12.2331f)
                curveTo(16.3335f, 11.5462f, 17.6762f, 11.5462f, 18.7069f, 12.2331f)
                curveTo(19.4749f, 12.7449f, 20.4699f, 12.757f, 21.2486f, 12.2694f)
                curveTo(21.233f, 11.5536f, 21.1871f, 11.1061f, 21.0821f, 10.7501f)
                horizontalLineTo(17.9463f)
                curveTo(16.8135f, 10.7501f, 15.8877f, 10.7501f, 15.1569f, 10.6518f)
                curveTo(14.3929f, 10.5491f, 13.7306f, 10.3268f, 13.2019f, 9.7982f)
                curveTo(12.6732f, 9.2695f, 12.4509f, 8.6071f, 12.3482f, 7.8432f)
                curveTo(12.2499f, 7.1123f, 12.25f, 6.1866f, 12.25f, 5.0537f)
                verticalLineTo(2.8336f)
                close()
                moveTo(13.75f, 3.6062f)
                verticalLineTo(5.0001f)
                curveTo(13.75f, 6.1998f, 13.7516f, 7.0241f, 13.8348f, 7.6433f)
                curveTo(13.9152f, 8.2409f, 14.059f, 8.5339f, 14.2625f, 8.7375f)
                curveTo(14.4661f, 8.941f, 14.7591f, 9.0849f, 15.3567f, 9.1652f)
                curveTo(15.9759f, 9.2485f, 16.8003f, 9.25f, 18.0f, 9.25f)
                horizontalLineTo(20.0255f)
                curveTo(19.729f, 8.9625f, 19.3491f, 8.618f, 18.8557f, 8.1742f)
                lineTo(14.8957f, 4.6112f)
                curveTo(14.4079f, 4.1724f, 14.0454f, 3.849f, 13.75f, 3.6062f)
                close()
                moveTo(10.178f, 1.25f)
                curveTo(11.5632f, 1.2497f, 12.4579f, 1.2494f, 13.2814f, 1.5653f)
                curveTo(14.1049f, 1.8812f, 14.7671f, 2.4773f, 15.7916f, 3.3995f)
                curveTo(15.8269f, 3.4313f, 15.8627f, 3.4635f, 15.8989f, 3.4962f)
                lineTo(19.859f, 7.059f)
                curveTo(19.9012f, 7.097f, 19.9428f, 7.1344f, 19.984f, 7.1714f)
                curveTo(21.168f, 8.236f, 21.9336f, 8.9245f, 22.3455f, 9.8489f)
                curveTo(22.665f, 10.566f, 22.7314f, 11.3208f, 22.7497f, 12.3135f)
                curveTo(22.7585f, 12.7861f, 22.5227f, 13.224f, 22.1366f, 13.4813f)
                curveTo(20.8463f, 14.3412f, 19.1654f, 14.3412f, 17.8751f, 13.4813f)
                curveTo(17.3481f, 13.1301f, 16.6616f, 13.1301f, 16.1347f, 13.4813f)
                curveTo(14.8444f, 14.3412f, 13.1634f, 14.3412f, 11.8731f, 13.4813f)
                curveTo(11.3462f, 13.1301f, 10.6597f, 13.1301f, 10.1327f, 13.4813f)
                curveTo(8.8424f, 14.3412f, 7.1615f, 14.3412f, 5.8712f, 13.4813f)
                curveTo(5.3442f, 13.1301f, 4.6577f, 13.1301f, 4.1308f, 13.4813f)
                curveTo(4.1206f, 13.4881f, 4.1104f, 13.4949f, 4.1003f, 13.5016f)
                curveTo(3.9951f, 13.5719f, 3.8921f, 13.6406f, 3.8041f, 13.6861f)
                curveTo(2.7138f, 14.2496f, 1.3965f, 13.5453f, 1.2607f, 12.3251f)
                curveTo(1.2498f, 12.2266f, 1.2499f, 12.1028f, 1.25f, 11.9764f)
                curveTo(1.25f, 11.9642f, 1.25f, 11.952f, 1.25f, 11.9397f)
                lineTo(1.25f, 9.9436f)
                curveTo(1.25f, 8.1059f, 1.25f, 6.6502f, 1.4032f, 5.511f)
                curveTo(1.5609f, 4.3385f, 1.8931f, 3.3896f, 2.6417f, 2.6412f)
                curveTo(3.3908f, 1.8923f, 4.3432f, 1.5606f, 5.5201f, 1.4031f)
                curveTo(6.6644f, 1.25f, 8.1277f, 1.25f, 9.9761f, 1.25f)
                lineTo(10.0324f, 1.25f)
                curveTo(10.0815f, 1.25f, 10.1301f, 1.25f, 10.178f, 1.25f)
                close()
                moveTo(5.8712f, 17.4813f)
                curveTo(5.3442f, 17.1301f, 4.6577f, 17.1301f, 4.1308f, 17.4813f)
                lineTo(3.5046f, 17.8986f)
                curveTo(3.2366f, 18.0772f, 3.0914f, 18.1755f, 2.993f, 18.2599f)
                curveTo(2.9501f, 18.2967f, 2.931f, 18.3188f, 2.9228f, 18.3294f)
                curveTo(2.9165f, 18.3375f, 2.9145f, 18.3416f, 2.9123f, 18.3472f)
                lineTo(2.9118f, 18.3485f)
                curveTo(2.905f, 18.366f, 2.899f, 18.3809f, 2.9051f, 18.4446f)
                curveTo(2.9145f, 18.5426f, 2.9438f, 18.6724f, 3.0078f, 18.941f)
                curveTo(3.1551f, 19.5588f, 3.3767f, 19.9727f, 3.7022f, 20.2981f)
                curveTo(4.1256f, 20.7213f, 4.7055f, 20.975f, 5.712f, 21.1103f)
                curveTo(6.74f, 21.2485f, 8.0952f, 21.2501f, 10.0026f, 21.2501f)
                horizontalLineTo(14.0039f)
                curveTo(15.9113f, 21.2501f, 17.2665f, 21.2485f, 18.2945f, 21.1103f)
                curveTo(19.301f, 20.975f, 19.8809f, 20.7213f, 20.3043f, 20.2981f)
                curveTo(20.7776f, 19.8249f, 21.0337f, 19.1631f, 21.1559f, 17.9503f)
                curveTo(20.0656f, 18.2922f, 18.8572f, 18.1358f, 17.8751f, 17.4813f)
                curveTo(17.3481f, 17.1301f, 16.6616f, 17.1301f, 16.1347f, 17.4813f)
                curveTo(14.8444f, 18.3412f, 13.1634f, 18.3412f, 11.8731f, 17.4813f)
                curveTo(11.3462f, 17.1301f, 10.6597f, 17.1301f, 10.1327f, 17.4813f)
                curveTo(8.8424f, 18.3412f, 7.1615f, 18.3412f, 5.8712f, 17.4813f)
                close()
                moveTo(3.2989f, 16.2331f)
                curveTo(4.3296f, 15.5462f, 5.6723f, 15.5462f, 6.703f, 16.2331f)
                curveTo(7.4896f, 16.7573f, 8.5143f, 16.7573f, 9.3008f, 16.2331f)
                curveTo(10.3316f, 15.5462f, 11.6743f, 15.5462f, 12.705f, 16.2331f)
                curveTo(13.4915f, 16.7573f, 14.5163f, 16.7573f, 15.3028f, 16.2331f)
                curveTo(16.3335f, 15.5462f, 17.6762f, 15.5462f, 18.7069f, 16.2331f)
                curveTo(19.4935f, 16.7573f, 20.5182f, 16.7573f, 21.3048f, 16.2331f)
                curveTo(21.9217f, 15.822f, 22.752f, 16.2805f, 22.721f, 17.0289f)
                curveTo(22.6429f, 18.9115f, 22.3944f, 20.3297f, 21.3648f, 21.3589f)
                curveTo(20.6162f, 22.1072f, 19.6671f, 22.4393f, 18.4943f, 22.5969f)
                curveTo(17.3548f, 22.7501f, 15.8987f, 22.7501f, 14.0603f, 22.7501f)
                horizontalLineTo(9.9462f)
                curveTo(8.1078f, 22.7501f, 6.6517f, 22.7501f, 5.5122f, 22.5969f)
                curveTo(4.3394f, 22.4393f, 3.3902f, 22.1072f, 2.6417f, 21.3589f)
                curveTo(2.0747f, 20.7921f, 1.7437f, 20.1068f, 1.5487f, 19.2888f)
                curveTo(1.5419f, 19.2604f, 1.535f, 19.2318f, 1.528f, 19.2029f)
                curveTo(1.4272f, 18.7868f, 1.313f, 18.3156f, 1.5163f, 17.7984f)
                curveTo(1.6315f, 17.5054f, 1.8138f, 17.2951f, 2.0164f, 17.1214f)
                curveTo(2.1925f, 16.9703f, 2.4157f, 16.8216f, 2.6441f, 16.6694f)
                lineTo(3.2989f, 16.2331f)
                close()
            }
        }
            .build()
        return _fileCorrupted!!
    }

private var _fileCorrupted: ImageVector? = null
