package com.chiksmedina.solar.bold.facesemotionsstickers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FacesEmotionsStickersGroup

public val FacesEmotionsStickersGroup.ExpressionlessSquare: ImageVector
    get() {
        if (_expressionlessSquare != null) {
            return _expressionlessSquare!!
        }
        _expressionlessSquare = Builder(name = "ExpressionlessSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(9.0f, 16.75f)
                curveTo(8.5858f, 16.75f, 8.25f, 16.4142f, 8.25f, 16.0f)
                curveTo(8.25f, 15.5858f, 8.5858f, 15.25f, 9.0f, 15.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 15.25f, 15.75f, 15.5858f, 15.75f, 16.0f)
                curveTo(15.75f, 16.4142f, 15.4142f, 16.75f, 15.0f, 16.75f)
                horizontalLineTo(9.0f)
                close()
                moveTo(10.0f, 10.5f)
                curveTo(10.0f, 11.3284f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 11.3284f, 8.0f, 10.5f)
                curveTo(8.0f, 9.6716f, 8.4477f, 9.0f, 9.0f, 9.0f)
                curveTo(9.5523f, 9.0f, 10.0f, 9.6716f, 10.0f, 10.5f)
                close()
                moveTo(15.0f, 12.0f)
                curveTo(15.5523f, 12.0f, 16.0f, 11.3284f, 16.0f, 10.5f)
                curveTo(16.0f, 9.6716f, 15.5523f, 9.0f, 15.0f, 9.0f)
                curveTo(14.4477f, 9.0f, 14.0f, 9.6716f, 14.0f, 10.5f)
                curveTo(14.0f, 11.3284f, 14.4477f, 12.0f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _expressionlessSquare!!
    }

private var _expressionlessSquare: ImageVector? = null
