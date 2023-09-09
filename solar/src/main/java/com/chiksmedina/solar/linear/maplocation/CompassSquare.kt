package com.chiksmedina.solar.linear.maplocation

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
import com.chiksmedina.solar.linear.MapLocationGroup

public val MapLocationGroup.CompassSquare: ImageVector
    get() {
        if (_compassSquare != null) {
            return _compassSquare!!
        }
        _compassSquare = Builder(name = "CompassSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0241f, 14.5601f)
                curveTo(10.7143f, 15.484f, 9.5594f, 15.946f, 8.8998f, 15.4977f)
                curveTo(8.7434f, 15.3914f, 8.6085f, 15.2565f, 8.5022f, 15.1001f)
                curveTo(8.0539f, 14.4405f, 8.5159f, 13.2856f, 9.4398f, 10.9758f)
                curveTo(9.6369f, 10.4831f, 9.7354f, 10.2368f, 9.9049f, 10.0435f)
                curveTo(9.948f, 9.9943f, 9.9944f, 9.9479f, 10.0437f, 9.9047f)
                curveTo(10.2369f, 9.7353f, 10.4832f, 9.6367f, 10.9759f, 9.4397f)
                curveTo(13.2857f, 8.5157f, 14.4406f, 8.0538f, 15.1002f, 8.5021f)
                curveTo(15.2566f, 8.6083f, 15.3915f, 8.7432f, 15.4978f, 8.8996f)
                curveTo(15.9461f, 9.5593f, 15.4841f, 10.7142f, 14.5602f, 13.024f)
                curveTo(14.3631f, 13.5166f, 14.2646f, 13.763f, 14.0951f, 13.9562f)
                curveTo(14.052f, 14.0055f, 14.0056f, 14.0518f, 13.9563f, 14.095f)
                curveTo(13.7631f, 14.2645f, 13.5168f, 14.363f, 13.0241f, 14.5601f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _compassSquare!!
    }

private var _compassSquare: ImageVector? = null
