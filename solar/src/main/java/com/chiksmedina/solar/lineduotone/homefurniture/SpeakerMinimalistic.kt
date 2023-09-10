package com.chiksmedina.solar.lineduotone.homefurniture

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
import com.chiksmedina.solar.lineduotone.HomeFurnitureGroup

val HomeFurnitureGroup.SpeakerMinimalistic: ImageVector
    get() {
        if (_speakerMinimalistic != null) {
            return _speakerMinimalistic!!
        }
        _speakerMinimalistic = Builder(
            name = "SpeakerMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 14.0f)
                curveTo(16.0f, 16.2091f, 14.2091f, 18.0f, 12.0f, 18.0f)
                curveTo(9.7909f, 18.0f, 8.0f, 16.2091f, 8.0f, 14.0f)
                curveTo(8.0f, 11.7909f, 9.7909f, 10.0f, 12.0f, 10.0f)
                curveTo(14.2091f, 10.0f, 16.0f, 11.7909f, 16.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 6.0f)
                horizontalLineTo(14.0f)
            }
        }
            .build()
        return _speakerMinimalistic!!
    }

private var _speakerMinimalistic: ImageVector? = null
