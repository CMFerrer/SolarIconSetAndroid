package dev.chiksmedina.solar.bold.maplocation

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
import dev.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.Routing3: ImageVector
    get() {
        if (_routing3 != null) {
            return _routing3!!
        }
        _routing3 = Builder(
            name = "Routing3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 19.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.25f, 5.0f)
                curveTo(10.25f, 4.5858f, 10.5858f, 4.25f, 11.0f, 4.25f)
                horizontalLineTo(16.1319f)
                curveTo(18.8831f, 4.25f, 19.9294f, 7.843f, 17.6083f, 9.3201f)
                lineTo(7.197f, 15.9454f)
                curveTo(6.142f, 16.6168f, 6.6175f, 18.25f, 7.8681f, 18.25f)
                horizontalLineTo(11.1893f)
                lineTo(10.9696f, 18.0303f)
                curveTo(10.6768f, 17.7374f, 10.6768f, 17.2626f, 10.9696f, 16.9697f)
                curveTo(11.2625f, 16.6768f, 11.7374f, 16.6768f, 12.0303f, 16.9697f)
                lineTo(13.5303f, 18.4697f)
                curveTo(13.8232f, 18.7626f, 13.8232f, 19.2374f, 13.5303f, 19.5303f)
                lineTo(12.0303f, 21.0303f)
                curveTo(11.7374f, 21.3232f, 11.2625f, 21.3232f, 10.9696f, 21.0303f)
                curveTo(10.6768f, 20.7374f, 10.6768f, 20.2626f, 10.9696f, 19.9697f)
                lineTo(11.1893f, 19.75f)
                horizontalLineTo(7.8681f)
                curveTo(5.1168f, 19.75f, 4.0706f, 16.157f, 6.3917f, 14.6799f)
                lineTo(16.803f, 8.0546f)
                curveTo(17.858f, 7.3832f, 17.3824f, 5.75f, 16.1319f, 5.75f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 5.75f, 10.25f, 5.4142f, 10.25f, 5.0f)
                close()
            }
        }
            .build()
        return _routing3!!
    }

private var _routing3: ImageVector? = null
