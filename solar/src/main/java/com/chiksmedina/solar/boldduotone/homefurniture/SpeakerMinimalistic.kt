package com.chiksmedina.solar.boldduotone.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

public val HomeFurnitureGroup.SpeakerMinimalistic: ImageVector
    get() {
        if (_speakerMinimalistic != null) {
            return _speakerMinimalistic!!
        }
        _speakerMinimalistic = Builder(name = "SpeakerMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.25f)
                curveTo(9.5858f, 5.25f, 9.25f, 5.5858f, 9.25f, 6.0f)
                curveTo(9.25f, 6.4142f, 9.5858f, 6.75f, 10.0f, 6.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 6.75f, 14.75f, 6.4142f, 14.75f, 6.0f)
                curveTo(14.75f, 5.5858f, 14.4142f, 5.25f, 14.0f, 5.25f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 9.25f)
                curveTo(9.3766f, 9.25f, 7.25f, 11.3766f, 7.25f, 14.0f)
                curveTo(7.25f, 16.6234f, 9.3766f, 18.75f, 12.0f, 18.75f)
                curveTo(14.6234f, 18.75f, 16.75f, 16.6234f, 16.75f, 14.0f)
                curveTo(16.75f, 11.3766f, 14.6234f, 9.25f, 12.0f, 9.25f)
                close()
            }
        }
        .build()
        return _speakerMinimalistic!!
    }

private var _speakerMinimalistic: ImageVector? = null
