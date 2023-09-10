package com.chiksmedina.solar.broken.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.BusinessStatisticGroup

val BusinessStatisticGroup.DiagramUp: ImageVector
    get() {
        if (_diagramUp != null) {
            return _diagramUp!!
        }
        _diagramUp = Builder(
            name = "DiagramUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(2.0f, 2.0f)
                verticalLineTo(5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0002f, 7.0f)
                lineTo(15.8821f, 10.9264f)
                curveTo(15.4045f, 11.5278f, 15.1657f, 11.8286f, 14.8916f, 11.9751f)
                curveTo(14.47f, 12.2005f, 13.9663f, 12.2114f, 13.5354f, 12.0046f)
                curveTo(13.2551f, 11.8701f, 13.0035f, 11.5801f, 12.5002f, 11.0f)
                curveTo(11.9968f, 10.4199f, 11.7452f, 10.1299f, 11.4649f, 9.9953f)
                curveTo(11.034f, 9.7886f, 10.5303f, 9.7995f, 10.1088f, 10.0248f)
                curveTo(9.8346f, 10.1714f, 9.5958f, 10.4721f, 9.1182f, 11.0735f)
                lineTo(6.0f, 15.0f)
            }
        }
            .build()
        return _diagramUp!!
    }

private var _diagramUp: ImageVector? = null
