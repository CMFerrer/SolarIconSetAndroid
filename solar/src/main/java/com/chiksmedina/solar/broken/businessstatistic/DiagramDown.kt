package com.chiksmedina.solar.broken.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.BusinessStatisticGroup

public val BusinessStatisticGroup.DiagramDown: ImageVector
    get() {
        if (_diagramDown != null) {
            return _diagramDown!!
        }
        _diagramDown = Builder(name = "DiagramDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0002f, 15.0f)
                lineTo(15.8821f, 11.0736f)
                curveTo(15.4045f, 10.4722f, 15.1657f, 10.1714f, 14.8916f, 10.0249f)
                curveTo(14.47f, 9.7995f, 13.9663f, 9.7886f, 13.5354f, 9.9954f)
                curveTo(13.2551f, 10.1299f, 13.0035f, 10.4199f, 12.5002f, 11.0f)
                curveTo(11.9968f, 11.5801f, 11.7452f, 11.8701f, 11.4649f, 12.0046f)
                curveTo(11.034f, 12.2115f, 10.5303f, 12.2005f, 10.1088f, 11.9752f)
                curveTo(9.8346f, 11.8286f, 9.5958f, 11.5279f, 9.1182f, 10.9265f)
                lineTo(6.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(2.0f, 2.0f)
                verticalLineTo(5.0f)
            }
        }
        .build()
        return _diagramDown!!
    }

private var _diagramDown: ImageVector? = null
