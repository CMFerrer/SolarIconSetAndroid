package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.HomeAdd: ImageVector
    get() {
        if (_homeAdd != null) {
            return _homeAdd!!
        }
        _homeAdd = Builder(
            name = "HomeAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.2041f)
                curveTo(2.0f, 9.9157f, 2.0f, 8.7715f, 2.5192f, 7.8229f)
                curveTo(3.0384f, 6.8744f, 3.9869f, 6.2857f, 5.884f, 5.1083f)
                lineTo(7.884f, 3.867f)
                curveTo(9.8894f, 2.6225f, 10.8921f, 2.0002f, 12.0f, 2.0002f)
                curveTo(13.1079f, 2.0002f, 14.1106f, 2.6225f, 16.116f, 3.867f)
                lineTo(18.116f, 5.1083f)
                curveTo(20.0131f, 6.2857f, 20.9616f, 6.8744f, 21.4808f, 7.8229f)
                curveTo(22.0f, 8.7715f, 22.0f, 9.9157f, 22.0f, 12.2041f)
                verticalLineTo(13.7251f)
                curveTo(22.0f, 17.626f, 22.0f, 19.5765f, 20.8284f, 20.7883f)
                curveTo(19.6569f, 22.0002f, 17.7712f, 22.0002f, 14.0f, 22.0002f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0002f, 4.3432f, 22.0002f, 3.1716f, 20.7883f)
                curveTo(2.0f, 19.5765f, 2.0f, 17.626f, 2.0f, 13.7251f)
                verticalLineTo(12.2041f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 14.0f)
                lineTo(12.0f, 14.0f)
                moveTo(12.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                moveTo(12.0f, 14.0f)
                lineTo(12.0f, 11.0f)
                moveTo(12.0f, 14.0f)
                lineTo(12.0f, 17.0f)
            }
        }
            .build()
        return _homeAdd!!
    }

private var _homeAdd: ImageVector? = null
