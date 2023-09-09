package com.chiksmedina.solar.linear.homefurniture

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
import com.chiksmedina.solar.linear.HomeFurnitureGroup

public val HomeFurnitureGroup.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                curveTo(4.0f, 6.2288f, 4.0f, 4.3432f, 5.1716f, 3.1716f)
                curveTo(6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7712f, 2.0f, 17.6569f, 2.0f, 18.8284f, 3.1716f)
                curveTo(20.0f, 4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(20.0f, 17.7712f, 20.0f, 19.6569f, 18.8284f, 20.8284f)
                curveTo(17.6569f, 22.0f, 15.7712f, 22.0f, 12.0f, 22.0f)
                curveTo(8.2288f, 22.0f, 6.3432f, 22.0f, 5.1716f, 20.8284f)
                curveTo(4.0f, 19.6569f, 4.0f, 17.7712f, 4.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 7.5f)
                curveTo(14.0f, 8.6046f, 13.1046f, 9.5f, 12.0f, 9.5f)
                curveTo(10.8954f, 9.5f, 10.0f, 8.6046f, 10.0f, 7.5f)
                curveTo(10.0f, 6.3954f, 10.8954f, 5.5f, 12.0f, 5.5f)
                curveTo(13.1046f, 5.5f, 14.0f, 6.3954f, 14.0f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 15.5f)
                curveTo(15.0f, 17.1569f, 13.6569f, 18.5f, 12.0f, 18.5f)
                curveTo(10.3431f, 18.5f, 9.0f, 17.1569f, 9.0f, 15.5f)
                curveTo(9.0f, 13.8431f, 10.3431f, 12.5f, 12.0f, 12.5f)
                curveTo(13.6569f, 12.5f, 15.0f, 13.8431f, 15.0f, 15.5f)
                close()
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
