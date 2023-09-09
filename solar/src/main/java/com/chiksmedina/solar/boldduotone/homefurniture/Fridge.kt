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

public val HomeFurnitureGroup.Fridge: ImageVector
    get() {
        if (_fridge != null) {
            return _fridge!!
        }
        _fridge = Builder(name = "Fridge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 11.5f)
                verticalLineTo(13.0f)
                curveTo(4.0f, 16.7712f, 4.0f, 18.6569f, 5.1716f, 19.8284f)
                curveTo(5.476f, 20.1328f, 5.8286f, 20.3582f, 6.25f, 20.5249f)
                verticalLineTo(22.0f)
                curveTo(6.25f, 22.4142f, 6.5858f, 22.75f, 7.0f, 22.75f)
                horizontalLineTo(8.0f)
                curveTo(8.4142f, 22.75f, 8.75f, 22.4142f, 8.75f, 22.0f)
                verticalLineTo(20.9534f)
                curveTo(9.6446f, 21.0f, 10.7124f, 21.0f, 12.0f, 21.0f)
                curveTo(13.2876f, 21.0f, 14.3554f, 21.0f, 15.25f, 20.9534f)
                verticalLineTo(22.0f)
                curveTo(15.25f, 22.4142f, 15.5858f, 22.75f, 16.0f, 22.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 22.75f, 17.75f, 22.4142f, 17.75f, 22.0f)
                verticalLineTo(20.5249f)
                curveTo(18.1714f, 20.3582f, 18.524f, 20.1328f, 18.8284f, 19.8284f)
                curveTo(20.0f, 18.6569f, 20.0f, 16.7712f, 20.0f, 13.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(4.0f)
                close()
                moveTo(17.0f, 13.25f)
                curveTo(17.4142f, 13.25f, 17.75f, 13.5858f, 17.75f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(17.75f, 16.4142f, 17.4142f, 16.75f, 17.0f, 16.75f)
                curveTo(16.5858f, 16.75f, 16.25f, 16.4142f, 16.25f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(16.25f, 13.5858f, 16.5858f, 13.25f, 17.0f, 13.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                curveTo(4.0f, 6.2288f, 4.0f, 4.3432f, 5.1716f, 3.1716f)
                curveTo(6.3432f, 2.0f, 8.2288f, 2.0f, 12.0f, 2.0f)
                curveTo(15.7712f, 2.0f, 17.6569f, 2.0f, 18.8284f, 3.1716f)
                curveTo(20.0f, 4.3432f, 20.0f, 6.2288f, 20.0f, 10.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 7.0f)
                curveTo(17.75f, 6.5858f, 17.4142f, 6.25f, 17.0f, 6.25f)
                curveTo(16.5858f, 6.25f, 16.25f, 6.5858f, 16.25f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(16.25f, 9.4142f, 16.5858f, 9.75f, 17.0f, 9.75f)
                curveTo(17.4142f, 9.75f, 17.75f, 9.4142f, 17.75f, 9.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _fridge!!
    }

private var _fridge: ImageVector? = null
