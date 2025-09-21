package dev.chiksmedina.solar.linear.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.linear.MapLocationGroup

val MapLocationGroup.PointOnMapPerspective: ImageVector
    get() {
        if (_pointOnMapPerspective != null) {
            return _pointOnMapPerspective!!
        }
        _pointOnMapPerspective = Builder(
            name = "PointOnMapPerspective", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.1213f, 21.1213f)
                curveTo(22.0f, 20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f)
                curveTo(22.0f, 13.1716f, 22.0f, 11.7574f, 21.1213f, 10.8787f)
                moveTo(21.1213f, 21.1213f)
                curveTo(20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 22.0f, 3.7574f, 22.0f, 2.8787f, 21.1213f)
                moveTo(21.1213f, 21.1213f)
                curveTo(21.1213f, 21.1213f, 21.1213f, 21.1213f, 21.1213f, 21.1213f)
                close()
                moveTo(21.1213f, 10.8787f)
                curveTo(20.2426f, 10.0f, 18.8284f, 10.0f, 16.0f, 10.0f)
                lineTo(8.0f, 10.0f)
                curveTo(5.1716f, 10.0f, 3.7574f, 10.0f, 2.8787f, 10.8787f)
                moveTo(21.1213f, 10.8787f)
                curveTo(21.1213f, 10.8787f, 21.1213f, 10.8787f, 21.1213f, 10.8787f)
                close()
                moveTo(2.8787f, 10.8787f)
                curveTo(2.0f, 11.7574f, 2.0f, 13.1716f, 2.0f, 16.0f)
                curveTo(2.0f, 18.8284f, 2.0f, 20.2426f, 2.8787f, 21.1213f)
                moveTo(2.8787f, 10.8787f)
                curveTo(2.8787f, 10.8787f, 2.8787f, 10.8787f, 2.8787f, 10.8787f)
                close()
                moveTo(2.8787f, 21.1213f)
                curveTo(2.8787f, 21.1213f, 2.8787f, 21.1213f, 2.8787f, 21.1213f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.5f, 21.0f)
                lineTo(12.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 13.0f)
                lineTo(17.0f, 8.0f)
            }
        }
            .build()
        return _pointOnMapPerspective!!
    }

private var _pointOnMapPerspective: ImageVector? = null
