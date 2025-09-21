package dev.chiksmedina.solar.bold.sports

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
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(
            name = "Running", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.75f, 4.5f)
                curveTo(20.75f, 5.8807f, 19.6307f, 7.0f, 18.25f, 7.0f)
                curveTo(16.8693f, 7.0f, 15.75f, 5.8807f, 15.75f, 4.5f)
                curveTo(15.75f, 3.1193f, 16.8693f, 2.0f, 18.25f, 2.0f)
                curveTo(19.6307f, 2.0f, 20.75f, 3.1193f, 20.75f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.8022f, 5.9306f)
                curveTo(10.0117f, 5.9017f, 10.2599f, 5.8754f, 10.523f, 5.887f)
                curveTo(10.603f, 5.8906f, 10.6938f, 5.8971f, 10.7962f, 5.9077f)
                curveTo(13.1789f, 6.155f, 14.9468f, 7.9432f, 16.1242f, 9.7093f)
                lineTo(16.1866f, 9.8028f)
                curveTo(16.7893f, 10.7069f, 17.8041f, 11.25f, 18.8907f, 11.25f)
                horizontalLineTo(20.75f)
                curveTo(21.1642f, 11.25f, 21.5f, 11.5858f, 21.5f, 12.0f)
                curveTo(21.5f, 12.4142f, 21.1642f, 12.75f, 20.75f, 12.75f)
                horizontalLineTo(18.8907f)
                curveTo(17.3025f, 12.75f, 15.8195f, 11.9563f, 14.9385f, 10.6349f)
                lineTo(14.8762f, 10.5414f)
                curveTo(14.6037f, 10.1327f, 14.311f, 9.7447f, 13.9989f, 9.3894f)
                lineTo(12.1149f, 11.7441f)
                curveTo(11.6875f, 12.2783f, 11.4008f, 12.6379f, 11.2076f, 12.9334f)
                curveTo(11.0204f, 13.2196f, 10.967f, 13.3792f, 10.9528f, 13.5003f)
                curveTo(10.9293f, 13.7003f, 10.9546f, 13.903f, 11.0263f, 14.0911f)
                curveTo(11.0698f, 14.2051f, 11.1607f, 14.3467f, 11.4123f, 14.5783f)
                curveTo(11.6721f, 14.8173f, 12.0382f, 15.0957f, 12.5835f, 15.5088f)
                curveTo(12.6157f, 15.5332f, 12.6475f, 15.5573f, 12.6789f, 15.5811f)
                curveTo(13.3998f, 16.1267f, 13.8989f, 16.5046f, 14.2444f, 17.0094f)
                curveTo(14.4408f, 17.2964f, 14.5963f, 17.6093f, 14.7065f, 17.9392f)
                curveTo(14.9002f, 18.5194f, 14.9f, 19.1454f, 14.8996f, 20.0495f)
                curveTo(14.8996f, 20.0888f, 14.8996f, 20.1287f, 14.8996f, 20.1692f)
                verticalLineTo(21.9998f)
                curveTo(14.8996f, 22.414f, 14.5638f, 22.7498f, 14.1496f, 22.7498f)
                curveTo(13.7354f, 22.7498f, 13.3996f, 22.414f, 13.3996f, 21.9998f)
                verticalLineTo(20.1692f)
                curveTo(13.3996f, 19.0986f, 13.3905f, 18.7342f, 13.2837f, 18.4143f)
                curveTo(13.2176f, 18.2164f, 13.1243f, 18.0287f, 13.0065f, 17.8565f)
                curveTo(12.8161f, 17.5782f, 12.531f, 17.3509f, 11.6777f, 16.7045f)
                lineTo(11.6488f, 16.6826f)
                curveTo(11.1398f, 16.2969f, 10.7155f, 15.9755f, 10.3965f, 15.682f)
                curveTo(10.0635f, 15.3754f, 9.7855f, 15.0471f, 9.6248f, 14.6256f)
                curveTo(9.4669f, 14.2116f, 9.4114f, 13.7657f, 9.463f, 13.3257f)
                curveTo(9.5155f, 12.8776f, 9.7045f, 12.4912f, 9.9522f, 12.1124f)
                curveTo(10.1895f, 11.7496f, 10.522f, 11.3339f, 10.9211f, 10.8353f)
                lineTo(12.9047f, 8.356f)
                curveTo(12.2175f, 7.8332f, 11.4608f, 7.4847f, 10.6414f, 7.3997f)
                curveTo(10.5672f, 7.392f, 10.5059f, 7.3877f, 10.4565f, 7.3856f)
                curveTo(10.3286f, 7.3799f, 10.1855f, 7.3919f, 10.0074f, 7.4165f)
                curveTo(8.942f, 7.5636f, 7.8745f, 8.1555f, 5.5562f, 9.4727f)
                lineTo(4.1205f, 10.2884f)
                curveTo(3.7604f, 10.4931f, 3.3025f, 10.367f, 3.0979f, 10.0069f)
                curveTo(2.8933f, 9.6467f, 3.0194f, 9.1889f, 3.3795f, 8.9843f)
                lineTo(4.8152f, 8.1685f)
                curveTo(4.8664f, 8.1394f, 4.9172f, 8.1106f, 4.9675f, 8.082f)
                curveTo(7.0865f, 6.8776f, 8.416f, 6.122f, 9.8022f, 5.9306f)
                close()
                moveTo(9.2301f, 16.4238f)
                curveTo(9.5484f, 16.689f, 9.5913f, 17.1619f, 9.3262f, 17.4801f)
                lineTo(8.3254f, 18.6811f)
                curveTo(8.2928f, 18.7202f, 8.2607f, 18.7588f, 8.2289f, 18.7969f)
                curveTo(7.5869f, 19.5685f, 7.1156f, 20.135f, 6.4576f, 20.4432f)
                curveTo(5.7996f, 20.7513f, 5.0627f, 20.7508f, 4.0589f, 20.7501f)
                curveTo(4.0093f, 20.75f, 3.959f, 20.75f, 3.9081f, 20.75f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 20.75f, 2.0f, 20.4142f, 2.0f, 20.0f)
                curveTo(2.0f, 19.5858f, 2.3358f, 19.25f, 2.75f, 19.25f)
                horizontalLineTo(3.9081f)
                curveTo(5.1297f, 19.25f, 5.504f, 19.2334f, 5.8213f, 19.0848f)
                curveTo(6.1387f, 18.9361f, 6.391f, 18.6593f, 7.1731f, 17.7208f)
                lineTo(8.1738f, 16.5199f)
                curveTo(8.439f, 16.2017f, 8.9119f, 16.1587f, 9.2301f, 16.4238f)
                close()
            }
        }
            .build()
        return _running!!
    }

private var _running: ImageVector? = null
