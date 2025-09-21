package dev.chiksmedina.solar.boldduotone.sports

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
import dev.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Dumbbell: ImageVector
    get() {
        if (_dumbbell != null) {
            return _dumbbell!!
        }
        _dumbbell = Builder(
            name = "Dumbbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 14.9319f, 22.0f, 15.3978f, 21.8478f, 15.7654f)
                curveTo(21.6448f, 16.2554f, 21.2554f, 16.6448f, 20.7654f, 16.8478f)
                curveTo(20.3978f, 17.0f, 19.9319f, 17.0f, 19.0f, 17.0f)
                curveTo(18.0681f, 17.0f, 17.6022f, 17.0f, 17.2346f, 16.8478f)
                curveTo(16.7446f, 16.6448f, 16.3552f, 16.2554f, 16.1522f, 15.7654f)
                curveTo(16.0f, 15.3978f, 16.0f, 14.4319f, 16.0f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(16.0f, 9.5681f, 16.0f, 8.6022f, 16.1522f, 8.2346f)
                curveTo(16.3552f, 7.7446f, 16.7446f, 7.3552f, 17.2346f, 7.1522f)
                curveTo(17.6022f, 7.0f, 18.0681f, 7.0f, 19.0f, 7.0f)
                curveTo(19.9319f, 7.0f, 20.3978f, 7.0f, 20.7654f, 7.1522f)
                curveTo(21.2554f, 7.3552f, 21.6448f, 7.7446f, 21.8478f, 8.2346f)
                curveTo(22.0f, 8.6022f, 22.0f, 9.0681f, 22.0f, 10.0f)
                close()
                moveTo(8.0f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(8.0f, 14.4319f, 8.0f, 15.3978f, 7.8478f, 15.7654f)
                curveTo(7.6448f, 16.2554f, 7.2554f, 16.6448f, 6.7654f, 16.8478f)
                curveTo(6.3978f, 17.0f, 5.9319f, 17.0f, 5.0f, 17.0f)
                curveTo(4.0681f, 17.0f, 3.6022f, 17.0f, 3.2346f, 16.8478f)
                curveTo(2.7446f, 16.6448f, 2.3552f, 16.2554f, 2.1522f, 15.7654f)
                curveTo(2.0f, 15.3978f, 2.0f, 14.9319f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 9.0681f, 2.0f, 8.6022f, 2.1522f, 8.2346f)
                curveTo(2.3552f, 7.7446f, 2.7446f, 7.3552f, 3.2346f, 7.1522f)
                curveTo(3.6022f, 7.0f, 4.0681f, 7.0f, 5.0f, 7.0f)
                curveTo(5.9319f, 7.0f, 6.3978f, 7.0f, 6.7654f, 7.1522f)
                curveTo(7.2554f, 7.3552f, 7.6448f, 7.7446f, 7.8478f, 8.2346f)
                curveTo(8.0f, 8.6022f, 8.0f, 9.5681f, 8.0f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 10.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
            .build()
        return _dumbbell!!
    }

private var _dumbbell: ImageVector? = null
