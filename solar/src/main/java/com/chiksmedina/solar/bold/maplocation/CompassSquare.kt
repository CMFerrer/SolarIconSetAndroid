package com.chiksmedina.solar.bold.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MapLocationGroup

public val MapLocationGroup.CompassSquare: ImageVector
    get() {
        if (_compassSquare != null) {
            return _compassSquare!!
        }
        _compassSquare = Builder(name = "CompassSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.9563f, 14.0951f)
                curveTo(13.7631f, 14.2646f, 13.5168f, 14.3631f, 13.0241f, 14.5602f)
                curveTo(10.7143f, 15.4841f, 9.5594f, 15.9461f, 8.8998f, 15.4978f)
                curveTo(8.7434f, 15.3915f, 8.6085f, 15.2566f, 8.5022f, 15.1002f)
                curveTo(8.0539f, 14.4406f, 8.5159f, 13.2857f, 9.4398f, 10.9759f)
                curveTo(9.6369f, 10.4832f, 9.7354f, 10.2369f, 9.9049f, 10.0437f)
                curveTo(9.948f, 9.9944f, 9.9944f, 9.948f, 10.0437f, 9.9049f)
                curveTo(10.2369f, 9.7354f, 10.4832f, 9.6369f, 10.9759f, 9.4398f)
                curveTo(13.2857f, 8.5159f, 14.4406f, 8.0539f, 15.1002f, 8.5022f)
                curveTo(15.2566f, 8.6085f, 15.3915f, 8.7434f, 15.4978f, 8.8998f)
                curveTo(15.9461f, 9.5594f, 15.4841f, 10.7143f, 14.5602f, 13.0241f)
                curveTo(14.3631f, 13.5168f, 14.2646f, 13.7631f, 14.0951f, 13.9563f)
                curveTo(14.052f, 14.0056f, 14.0056f, 14.052f, 13.9563f, 14.0951f)
                close()
            }
        }
        .build()
        return _compassSquare!!
    }

private var _compassSquare: ImageVector? = null
