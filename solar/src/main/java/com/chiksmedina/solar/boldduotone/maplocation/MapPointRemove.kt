package com.chiksmedina.solar.boldduotone.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MapLocationGroup

public val MapLocationGroup.MapPointRemove: ImageVector
    get() {
        if (_mapPointRemove != null) {
            return _mapPointRemove!!
        }
        _mapPointRemove = Builder(name = "MapPointRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.6055f, 20.0f, 10.1433f)
                curveTo(20.0f, 5.6459f, 16.4183f, 2.0f, 12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 5.6459f, 4.0f, 10.1433f)
                curveTo(4.0f, 14.6055f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.25f)
                curveTo(8.5858f, 9.25f, 8.25f, 9.5858f, 8.25f, 10.0f)
                curveTo(8.25f, 10.4142f, 8.5858f, 10.75f, 9.0f, 10.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 10.75f, 15.75f, 10.4142f, 15.75f, 10.0f)
                curveTo(15.75f, 9.5858f, 15.4142f, 9.25f, 15.0f, 9.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _mapPointRemove!!
    }

private var _mapPointRemove: ImageVector? = null
