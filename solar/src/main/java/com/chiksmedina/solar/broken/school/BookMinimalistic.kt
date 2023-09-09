package com.chiksmedina.solar.broken.school

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
import com.chiksmedina.solar.broken.SchoolGroup

public val SchoolGroup.BookMinimalistic: ImageVector
    get() {
        if (_bookMinimalistic != null) {
            return _bookMinimalistic!!
        }
        _bookMinimalistic = Builder(name = "BookMinimalistic", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8978f, 16.0f)
                horizontalLineTo(7.8978f)
                curveTo(6.9678f, 16.0f, 6.5028f, 16.0f, 6.1213f, 16.1022f)
                curveTo(5.086f, 16.3796f, 4.2774f, 17.1883f, 4.0f, 18.2235f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 16.0f)
                verticalLineTo(2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                curveTo(7.1716f, 22.0f, 5.7574f, 22.0f, 4.8787f, 21.1213f)
                curveTo(4.0f, 20.2426f, 4.0f, 18.8284f, 4.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 5.1716f, 4.0f, 3.7574f, 4.8787f, 2.8787f)
                curveTo(5.7574f, 2.0f, 7.1716f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(16.8284f, 2.0f, 18.2426f, 2.0f, 19.1213f, 2.8787f)
                curveTo(20.0f, 3.7574f, 20.0f, 5.1716f, 20.0f, 8.0f)
                moveTo(14.0f, 22.0f)
                curveTo(16.8284f, 22.0f, 18.2426f, 22.0f, 19.1213f, 21.1213f)
                curveTo(20.0f, 20.2426f, 20.0f, 18.8284f, 20.0f, 16.0f)
                verticalLineTo(12.0f)
            }
        }
        .build()
        return _bookMinimalistic!!
    }

private var _bookMinimalistic: ImageVector? = null
