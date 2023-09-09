package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.AstronomyGroup

public val AstronomyGroup.Men: ImageVector
    get() {
        if (_men != null) {
            return _men!!
        }
        _men = Builder(name = "Men", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 7.0703f)
                curveTo(7.1767f, 6.3896f, 8.5428f, 6.0f, 10.0f, 6.0f)
                curveTo(14.4183f, 6.0f, 18.0f, 9.5817f, 18.0f, 14.0f)
                curveTo(18.0f, 18.4183f, 14.4183f, 22.0f, 10.0f, 22.0f)
                curveTo(5.5817f, 22.0f, 2.0f, 18.4183f, 2.0f, 14.0f)
                curveTo(2.0f, 12.5429f, 2.3896f, 11.1767f, 3.0703f, 10.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                verticalLineTo(2.0f)
                close()
                moveTo(21.25f, 7.0f)
                curveTo(21.25f, 7.4142f, 21.5858f, 7.75f, 22.0f, 7.75f)
                curveTo(22.4142f, 7.75f, 22.75f, 7.4142f, 22.75f, 7.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(17.0f, 1.25f)
                curveTo(16.5858f, 1.25f, 16.25f, 1.5858f, 16.25f, 2.0f)
                curveTo(16.25f, 2.4142f, 16.5858f, 2.75f, 17.0f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(16.0303f, 9.0303f)
                lineTo(22.5303f, 2.5303f)
                lineTo(21.4697f, 1.4697f)
                lineTo(14.9697f, 7.9697f)
                lineTo(16.0303f, 9.0303f)
                close()
                moveTo(21.25f, 2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.75f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(17.0f, 2.75f)
                horizontalLineTo(22.0f)
                verticalLineTo(1.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _men!!
    }

private var _men: ImageVector? = null
