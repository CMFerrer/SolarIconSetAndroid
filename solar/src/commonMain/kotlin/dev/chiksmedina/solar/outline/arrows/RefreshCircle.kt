package dev.chiksmedina.solar.outline.arrows

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
import dev.chiksmedina.solar.outline.ArrowsGroup

val ArrowsGroup.RefreshCircle: ImageVector
    get() {
        if (_refreshCircle != null) {
            return _refreshCircle!!
        }
        _refreshCircle = Builder(
            name = "RefreshCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.7127f, 10.6736f)
                curveTo(7.1672f, 8.1549f, 9.3854f, 6.25f, 12.0437f, 6.25f)
                curveTo(13.6212f, 6.25f, 15.0431f, 6.9209f, 16.0328f, 7.9907f)
                curveTo(16.3141f, 8.2948f, 16.2956f, 8.7693f, 15.9915f, 9.0506f)
                curveTo(15.6875f, 9.3318f, 15.213f, 9.3134f, 14.9317f, 9.0093f)
                curveTo(14.2154f, 8.235f, 13.1879f, 7.75f, 12.0437f, 7.75f)
                curveTo(10.2056f, 7.75f, 8.6697f, 9.0021f, 8.2445f, 10.6853f)
                lineTo(8.481f, 10.4586f)
                curveTo(8.7799f, 10.172f, 9.2547f, 10.182f, 9.5414f, 10.4809f)
                curveTo(9.828f, 10.7799f, 9.8181f, 11.2547f, 9.519f, 11.5414f)
                lineTo(7.8966f, 13.0969f)
                curveTo(7.7493f, 13.2381f, 7.5508f, 13.3133f, 7.347f, 13.3049f)
                curveTo(7.1431f, 13.2966f, 6.9514f, 13.2056f, 6.8161f, 13.0528f)
                lineTo(5.4385f, 11.4972f)
                curveTo(5.1639f, 11.1871f, 5.1927f, 10.7131f, 5.5028f, 10.4385f)
                curveTo(5.8129f, 10.1639f, 6.2869f, 10.1927f, 6.5615f, 10.5028f)
                lineTo(6.7127f, 10.6736f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.6485f, 10.6959f)
                curveTo(16.8523f, 10.704f, 17.044f, 10.7947f, 17.1795f, 10.9472f)
                lineTo(18.5607f, 12.5019f)
                curveTo(18.8358f, 12.8115f, 18.8078f, 13.2856f, 18.4981f, 13.5607f)
                curveTo(18.1885f, 13.8358f, 17.7144f, 13.8078f, 17.4393f, 13.4981f)
                lineTo(17.2841f, 13.3234f)
                curveTo(16.8295f, 15.8458f, 14.6011f, 17.7509f, 11.9348f, 17.7509f)
                curveTo(10.3635f, 17.7509f, 8.9454f, 17.0895f, 7.9531f, 16.0322f)
                curveTo(7.6697f, 15.7302f, 7.6847f, 15.2555f, 7.9868f, 14.9721f)
                curveTo(8.2888f, 14.6886f, 8.7634f, 14.7037f, 9.0469f, 15.0057f)
                curveTo(9.7655f, 15.7714f, 10.792f, 16.2509f, 11.9348f, 16.2509f)
                curveTo(13.7819f, 16.2509f, 15.322f, 14.9991f, 15.7503f, 13.3193f)
                lineTo(15.5195f, 13.5409f)
                curveTo(15.2208f, 13.8278f, 14.746f, 13.8183f, 14.4591f, 13.5195f)
                curveTo(14.1721f, 13.2208f, 14.1817f, 12.746f, 14.4805f, 12.4591f)
                lineTo(16.0993f, 10.9044f)
                curveTo(16.2464f, 10.7631f, 16.4447f, 10.6878f, 16.6485f, 10.6959f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                close()
            }
        }
            .build()
        return _refreshCircle!!
    }

private var _refreshCircle: ImageVector? = null
