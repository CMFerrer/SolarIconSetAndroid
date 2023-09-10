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

val BusinessStatisticGroup.PresentationGraph: ImageVector
    get() {
        if (_presentationGraph != null) {
            return _presentationGraph!!
        }
        _presentationGraph = Builder(
            name = "PresentationGraph", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(22.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 10.5f)
                lineTo(10.2929f, 9.2071f)
                curveTo(10.6262f, 8.8738f, 10.7929f, 8.7071f, 11.0f, 8.7071f)
                curveTo(11.2071f, 8.7071f, 11.3738f, 8.8738f, 11.7071f, 9.2071f)
                lineTo(12.2929f, 9.7929f)
                curveTo(12.6262f, 10.1262f, 12.7929f, 10.2929f, 13.0f, 10.2929f)
                curveTo(13.2071f, 10.2929f, 13.3738f, 10.1262f, 13.7071f, 9.7929f)
                lineTo(15.0f, 8.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 21.0f)
                lineTo(12.0f, 17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 22.0f)
                lineTo(12.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 22.0f)
                lineTo(12.0f, 21.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 2.0f)
                verticalLineTo(10.5f)
                curveTo(4.0f, 13.5641f, 4.0f, 15.0962f, 5.0042f, 16.0481f)
                curveTo(6.0084f, 17.0f, 7.6247f, 17.0f, 10.8571f, 17.0f)
                horizontalLineTo(13.1429f)
                curveTo(16.3753f, 17.0f, 17.9916f, 17.0f, 18.9958f, 16.0481f)
                curveTo(20.0f, 15.0962f, 20.0f, 13.5641f, 20.0f, 10.5f)
                verticalLineTo(10.0f)
                moveTo(20.0f, 2.0f)
                verticalLineTo(6.0f)
            }
        }
            .build()
        return _presentationGraph!!
    }

private var _presentationGraph: ImageVector? = null
