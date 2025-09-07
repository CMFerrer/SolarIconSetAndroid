package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(
            name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 22.0f)
                verticalLineTo(14.0f)
                verticalLineTo(4.0f)
                verticalLineTo(2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 14.0f)
                lineTo(7.4707f, 13.5059f)
                curveTo(9.1212f, 13.1758f, 10.8321f, 13.3329f, 12.3949f, 13.958f)
                curveTo(14.0885f, 14.6354f, 15.9524f, 14.7619f, 17.722f, 14.3195f)
                lineTo(17.9364f, 14.2659f)
                curveTo(18.5615f, 14.1097f, 19.0f, 13.548f, 19.0f, 12.9038f)
                verticalLineTo(5.5367f)
                curveTo(19.0f, 4.7562f, 18.2665f, 4.1834f, 17.5092f, 4.3727f)
                curveTo(15.878f, 4.7806f, 14.1597f, 4.6639f, 12.5986f, 4.0395f)
                lineTo(12.3949f, 3.958f)
                curveTo(10.8321f, 3.3329f, 9.1212f, 3.1758f, 7.4707f, 3.5059f)
                lineTo(5.0f, 4.0f)
            }
        }
            .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
