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

public val HomeFurnitureGroup.Closet2: ImageVector
    get() {
        if (_closet2 != null) {
            return _closet2!!
        }
        _closet2 = Builder(name = "Closet2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                curveTo(2.0f, 4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 15.7712f, 2.0f, 17.6569f, 3.1716f, 18.8284f)
                curveTo(3.476f, 19.1328f, 3.8286f, 19.3582f, 4.25f, 19.5249f)
                verticalLineTo(22.0f)
                curveTo(4.25f, 22.4142f, 4.5858f, 22.75f, 5.0f, 22.75f)
                curveTo(5.4142f, 22.75f, 5.75f, 22.4142f, 5.75f, 22.0f)
                verticalLineTo(19.8713f)
                curveTo(6.8199f, 20.0f, 8.1936f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(9.0f, 8.25f)
                curveTo(9.4142f, 8.25f, 9.75f, 8.5858f, 9.75f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(9.75f, 13.4142f, 9.4142f, 13.75f, 9.0f, 13.75f)
                curveTo(8.5858f, 13.75f, 8.25f, 13.4142f, 8.25f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(8.25f, 8.5858f, 8.5858f, 8.25f, 9.0f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 2.0f, 19.6569f, 2.0f, 20.8284f, 3.1716f)
                curveTo(22.0f, 4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 15.7712f, 22.0f, 17.6569f, 20.8284f, 18.8284f)
                curveTo(20.524f, 19.1328f, 20.1714f, 19.3582f, 19.75f, 19.5249f)
                verticalLineTo(22.0f)
                curveTo(19.75f, 22.4142f, 19.4142f, 22.75f, 19.0f, 22.75f)
                curveTo(18.5858f, 22.75f, 18.25f, 22.4142f, 18.25f, 22.0f)
                verticalLineTo(19.8713f)
                curveTo(17.1801f, 20.0f, 15.8064f, 20.0f, 14.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 9.0f)
                curveTo(15.75f, 8.5858f, 15.4142f, 8.25f, 15.0f, 8.25f)
                curveTo(14.5858f, 8.25f, 14.25f, 8.5858f, 14.25f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(14.25f, 13.4142f, 14.5858f, 13.75f, 15.0f, 13.75f)
                curveTo(15.4142f, 13.75f, 15.75f, 13.4142f, 15.75f, 13.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _closet2!!
    }

private var _closet2: ImageVector? = null
