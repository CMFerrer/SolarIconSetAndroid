package dev.chiksmedina.solar.boldduotone.arrows

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
import dev.chiksmedina.solar.boldduotone.ArrowsGroup

val ArrowsGroup.Restart: ImageVector
    get() {
        if (_restart != null) {
            return _restart!!
        }
        _restart = Builder(
            name = "Restart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(6.8735f, 7.8734f)
                curveTo(9.0161f, 5.7308f, 12.1674f, 5.209f, 14.8007f, 6.3104f)
                lineTo(15.9309f, 5.1802f)
                curveTo(12.6515f, 3.5311f, 8.5512f, 4.0743f, 5.8128f, 6.8127f)
                curveTo(2.3957f, 10.2298f, 2.3957f, 15.77f, 5.8128f, 19.1871f)
                curveTo(9.2299f, 22.6042f, 14.7701f, 22.6042f, 18.1872f, 19.1871f)
                curveTo(20.1746f, 17.1997f, 21.0057f, 14.4933f, 20.6819f, 11.9072f)
                curveTo(20.6304f, 11.4962f, 20.2555f, 11.2048f, 19.8445f, 11.2562f)
                curveTo(19.4335f, 11.3077f, 19.142f, 11.6826f, 19.1935f, 12.0936f)
                curveTo(19.4622f, 14.24f, 18.7727f, 16.4802f, 17.1265f, 18.1264f)
                curveTo(14.2952f, 20.9577f, 9.7048f, 20.9577f, 6.8735f, 18.1264f)
                curveTo(4.0422f, 15.2951f, 4.0422f, 10.7047f, 6.8735f, 7.8734f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.7212f, 4.2012f)
                curveTo(18.7212f, 3.8979f, 18.5384f, 3.6244f, 18.2582f, 3.5083f)
                curveTo(17.9779f, 3.3922f, 17.6553f, 3.4564f, 17.4408f, 3.6709f)
                lineTo(15.9314f, 5.1803f)
                lineTo(14.8012f, 6.3105f)
                lineTo(13.1982f, 7.9135f)
                curveTo(12.9837f, 8.128f, 12.9195f, 8.4506f, 13.0356f, 8.7309f)
                curveTo(13.1517f, 9.0111f, 13.4252f, 9.1938f, 13.7285f, 9.1938f)
                horizontalLineTo(17.9712f)
                curveTo(18.3854f, 9.1938f, 18.7212f, 8.8581f, 18.7212f, 8.4438f)
                verticalLineTo(4.2012f)
                close()
            }
        }
            .build()
        return _restart!!
    }

private var _restart: ImageVector? = null
