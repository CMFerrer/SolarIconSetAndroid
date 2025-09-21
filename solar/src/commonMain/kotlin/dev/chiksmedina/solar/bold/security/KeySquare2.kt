package dev.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.KeySquare2: ImageVector
    get() {
        if (_keySquare2 != null) {
            return _keySquare2!!
        }
        _keySquare2 = Builder(
            name = "KeySquare2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 6.7201f)
                curveTo(22.0f, 9.3269f, 19.8781f, 11.4402f, 17.2606f, 11.4402f)
                curveTo(16.7829f, 11.4402f, 15.6954f, 11.3304f, 15.1664f, 10.8913f)
                lineTo(14.505f, 11.5499f)
                curveTo(14.1162f, 11.9372f, 14.2212f, 12.0512f, 14.3942f, 12.239f)
                curveTo(14.4664f, 12.3174f, 14.5504f, 12.4086f, 14.6153f, 12.5378f)
                curveTo(14.6153f, 12.5378f, 15.1664f, 13.3062f, 14.6153f, 14.0746f)
                curveTo(14.2846f, 14.5137f, 13.3588f, 15.1284f, 12.3007f, 14.0746f)
                lineTo(12.0802f, 14.2942f)
                curveTo(12.0802f, 14.2942f, 12.7415f, 15.0625f, 12.1904f, 15.8309f)
                curveTo(11.8598f, 16.27f, 10.978f, 16.7091f, 10.2065f, 15.9407f)
                lineTo(9.4349f, 16.7091f)
                curveTo(8.9059f, 17.236f, 8.2593f, 16.9286f, 8.0021f, 16.7091f)
                lineTo(7.3408f, 16.0505f)
                curveTo(6.7236f, 15.4358f, 7.0836f, 14.7698f, 7.3408f, 14.5137f)
                lineTo(13.0722f, 8.8057f)
                curveTo(13.0722f, 8.8057f, 12.5211f, 7.9275f, 12.5211f, 6.7201f)
                curveTo(12.5211f, 4.1132f, 14.643f, 2.0f, 17.2606f, 2.0f)
                curveTo(19.8781f, 2.0f, 22.0f, 4.1132f, 22.0f, 6.7201f)
                close()
                moveTo(18.914f, 6.72f)
                curveTo(18.914f, 7.6294f, 18.1738f, 8.3666f, 17.2607f, 8.3666f)
                curveTo(16.3476f, 8.3666f, 15.6074f, 7.6294f, 15.6074f, 6.72f)
                curveTo(15.6074f, 5.8107f, 16.3476f, 5.0735f, 17.2607f, 5.0735f)
                curveTo(18.1738f, 5.0735f, 18.914f, 5.8107f, 18.914f, 6.72f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.1957f, 2.001f)
                curveTo(11.865f, 3.1408f, 11.0211f, 4.8306f, 11.0211f, 6.7201f)
                curveTo(11.0211f, 7.4013f, 11.1482f, 7.997f, 11.2945f, 8.4591f)
                lineTo(6.2822f, 13.4509f)
                curveTo(5.9837f, 13.7482f, 5.6393f, 14.2521f, 5.5325f, 14.9056f)
                curveTo(5.4103f, 15.6532f, 5.627f, 16.4607f, 6.2822f, 17.1133f)
                lineTo(6.9436f, 17.7719f)
                curveTo(6.9707f, 17.799f, 6.999f, 17.825f, 7.0282f, 17.8499f)
                curveTo(7.3232f, 18.1018f, 7.8022f, 18.3849f, 8.3972f, 18.4729f)
                curveTo(9.064f, 18.5714f, 9.8467f, 18.4108f, 10.4855f, 17.7797f)
                curveTo(10.8715f, 17.877f, 11.2658f, 17.8846f, 11.6459f, 17.8118f)
                curveTo(12.4f, 17.6674f, 13.0186f, 17.2246f, 13.3886f, 16.7333f)
                curveTo(13.3956f, 16.724f, 13.4025f, 16.7146f, 13.4093f, 16.7051f)
                curveTo(13.5422f, 16.5199f, 13.6438f, 16.3329f, 13.7196f, 16.1477f)
                curveTo(13.8164f, 16.1397f, 13.9134f, 16.1265f, 14.0102f, 16.1082f)
                curveTo(14.872f, 15.9447f, 15.4856f, 15.4122f, 15.8134f, 14.977f)
                curveTo(15.8204f, 14.9677f, 15.8273f, 14.9583f, 15.8341f, 14.9488f)
                curveTo(16.3624f, 14.2123f, 16.4169f, 13.4474f, 16.3209f, 12.868f)
                curveTo(16.6837f, 12.9207f, 17.0171f, 12.9402f, 17.2605f, 12.9402f)
                curveTo(19.1541f, 12.9402f, 20.8536f, 12.0981f, 21.9989f, 10.7671f)
                curveTo(22.0f, 11.1592f, 22.0f, 11.5698f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(12.4166f, 2.0f, 12.8149f, 2.0f, 13.1957f, 2.001f)
                close()
            }
        }
            .build()
        return _keySquare2!!
    }

private var _keySquare2: ImageVector? = null
