package com.chiksmedina.solar.broken.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.HomeFurnitureGroup

public val HomeFurnitureGroup.Chair2: ImageVector
    get() {
        if (_chair2 != null) {
            return _chair2!!
        }
        _chair2 = Builder(name = "Chair2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 15.5f)
                curveTo(6.0f, 14.9477f, 6.4477f, 14.5f, 7.0f, 14.5f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 14.5f, 18.0f, 14.9477f, 18.0f, 15.5f)
                curveTo(18.0f, 16.6046f, 17.1046f, 17.5f, 16.0f, 17.5f)
                horizontalLineTo(8.0f)
                curveTo(6.8954f, 17.5f, 6.0f, 16.6046f, 6.0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.7902f, 2.4957f)
                curveTo(15.0386f, 2.0f, 14.0257f, 2.0f, 11.9999f, 2.0f)
                curveTo(9.9741f, 2.0f, 8.9612f, 2.0f, 8.2097f, 2.4957f)
                curveTo(7.9711f, 2.653f, 7.7563f, 2.8435f, 7.5717f, 3.0616f)
                curveTo(6.9901f, 3.7487f, 6.8694f, 4.7544f, 6.628f, 6.7658f)
                lineTo(6.5371f, 7.5234f)
                curveTo(6.2866f, 9.6109f, 6.1613f, 10.6546f, 6.7582f, 11.3273f)
                curveTo(7.355f, 12.0f, 8.4062f, 12.0f, 10.5086f, 12.0f)
                horizontalLineTo(13.4912f)
                curveTo(15.5936f, 12.0f, 16.6448f, 12.0f, 17.2416f, 11.3273f)
                curveTo(17.8385f, 10.6546f, 17.7132f, 9.6109f, 17.4627f, 7.5234f)
                lineTo(17.3718f, 6.7658f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(20.0f)
                moveTo(12.0f, 20.0f)
                verticalLineTo(17.5f)
                moveTo(12.0f, 20.0f)
                horizontalLineTo(12.5f)
                curveTo(13.5f, 20.0f, 14.1886f, 21.0658f, 14.5f, 22.0f)
                moveTo(12.0f, 20.0f)
                horizontalLineTo(11.5f)
                curveTo(10.5f, 20.0f, 9.8114f, 21.0658f, 9.5f, 22.0f)
                moveTo(6.0f, 15.5f)
                lineTo(5.0f, 13.0f)
                curveTo(4.5f, 12.0f, 4.0f, 11.5f, 2.0f, 11.5f)
                moveTo(18.0f, 15.5f)
                lineTo(19.0f, 13.0f)
                curveTo(19.5f, 12.0f, 20.0f, 11.5f, 22.0f, 11.5f)
            }
        }
        .build()
        return _chair2!!
    }

private var _chair2: ImageVector? = null
