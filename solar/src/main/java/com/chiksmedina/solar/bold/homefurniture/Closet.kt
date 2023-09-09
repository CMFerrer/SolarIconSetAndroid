package com.chiksmedina.solar.bold.homefurniture

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
import com.chiksmedina.solar.bold.HomeFurnitureGroup

public val HomeFurnitureGroup.Closet: ImageVector
    get() {
        if (_closet != null) {
            return _closet!!
        }
        _closet = Builder(name = "Closet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                curveTo(2.328f, 4.0151f, 2.0919f, 5.2288f, 2.0257f, 7.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0019f, 8.75f)
                curveTo(2.0f, 9.142f, 2.0f, 9.5581f, 2.0f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(2.0f, 13.4419f, 2.0f, 13.858f, 2.0019f, 14.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(2.0019f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.1716f, 19.8284f)
                curveTo(2.328f, 18.9849f, 2.0919f, 17.7712f, 2.0257f, 15.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                curveTo(8.1936f, 21.0f, 6.8199f, 21.0f, 5.75f, 20.8713f)
                verticalLineTo(22.0f)
                curveTo(5.75f, 22.4142f, 5.4142f, 22.75f, 5.0f, 22.75f)
                curveTo(4.5858f, 22.75f, 4.25f, 22.4142f, 4.25f, 22.0f)
                verticalLineTo(20.5249f)
                curveTo(3.8286f, 20.3582f, 3.476f, 20.1328f, 3.1716f, 19.8284f)
                close()
                moveTo(6.25f, 18.0f)
                curveTo(6.25f, 17.5858f, 6.5858f, 17.25f, 7.0f, 17.25f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 17.25f, 9.75f, 17.5858f, 9.75f, 18.0f)
                curveTo(9.75f, 18.4142f, 9.4142f, 18.75f, 9.0f, 18.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 18.75f, 6.25f, 18.4142f, 6.25f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.75f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(15.8064f, 21.0f, 17.1801f, 21.0f, 18.25f, 20.8713f)
                verticalLineTo(22.0f)
                curveTo(18.25f, 22.4142f, 18.5858f, 22.75f, 19.0f, 22.75f)
                curveTo(19.4142f, 22.75f, 19.75f, 22.4142f, 19.75f, 22.0f)
                verticalLineTo(20.5249f)
                curveTo(20.1714f, 20.3582f, 20.524f, 20.1328f, 20.8284f, 19.8284f)
                curveTo(21.672f, 18.9849f, 21.9082f, 17.7712f, 21.9743f, 15.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(21.0f)
                close()
                moveTo(15.0f, 17.25f)
                curveTo(14.5858f, 17.25f, 14.25f, 17.5858f, 14.25f, 18.0f)
                curveTo(14.25f, 18.4142f, 14.5858f, 18.75f, 15.0f, 18.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 18.75f, 17.75f, 18.4142f, 17.75f, 18.0f)
                curveTo(17.75f, 17.5858f, 17.4142f, 17.25f, 17.0f, 17.25f)
                horizontalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 13.0f)
                curveTo(22.0f, 13.4419f, 22.0f, 13.858f, 21.9981f, 14.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(15.0f, 7.25f)
                curveTo(15.4142f, 7.25f, 15.75f, 7.5858f, 15.75f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(15.75f, 10.4142f, 15.4142f, 10.75f, 15.0f, 10.75f)
                curveTo(14.5858f, 10.75f, 14.25f, 10.4142f, 14.25f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(14.25f, 7.5858f, 14.5858f, 7.25f, 15.0f, 7.25f)
                close()
            }
        }
        .build()
        return _closet!!
    }

private var _closet: ImageVector? = null
