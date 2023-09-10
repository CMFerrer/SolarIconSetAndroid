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

val EssentionalUiGroup.SmartHome: ImageVector
    get() {
        if (_smartHome != null) {
            return _smartHome!!
        }
        _smartHome = Builder(
            name = "SmartHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 22.0002f)
                curveTo(17.7712f, 22.0002f, 19.6568f, 22.0002f, 20.8284f, 20.7883f)
                curveTo(22.0f, 19.5765f, 22.0f, 17.626f, 22.0f, 13.7251f)
                verticalLineTo(12.2041f)
                curveTo(22.0f, 9.9157f, 22.0f, 8.7715f, 21.4808f, 7.8229f)
                curveTo(20.9616f, 6.8744f, 20.013f, 6.2857f, 18.116f, 5.1083f)
                lineTo(16.116f, 3.867f)
                curveTo(14.1106f, 2.6225f, 13.1079f, 2.0002f, 12.0f, 2.0002f)
                curveTo(10.8921f, 2.0002f, 9.8894f, 2.6225f, 7.884f, 3.867f)
                lineTo(5.884f, 5.1083f)
                curveTo(3.9869f, 6.2857f, 3.0384f, 6.8744f, 2.5192f, 7.8229f)
                curveTo(2.2016f, 8.4031f, 2.0783f, 9.0565f, 2.0304f, 10.0002f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 22.0f)
                curveTo(11.0f, 17.0294f, 6.9706f, 13.0f, 2.0f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 22.0f)
                curveTo(8.0f, 18.6863f, 5.3137f, 16.0f, 2.0f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 22.0f)
                curveTo(5.0f, 20.3431f, 3.6569f, 19.0f, 2.0f, 19.0f)
            }
        }
            .build()
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
