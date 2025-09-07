package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.SmartHomeAngle: ImageVector
    get() {
        if (_smartHomeAngle != null) {
            return _smartHomeAngle!!
        }
        _smartHomeAngle = Builder(
            name = "SmartHomeAngle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.011f, 10.0002f)
                curveTo(1.9672f, 9.1256f, 2.0484f, 8.4734f, 2.3352f, 7.8751f)
                curveTo(2.8757f, 6.7478f, 4.0261f, 6.0625f, 6.3268f, 4.692f)
                lineTo(7.7116f, 3.867f)
                curveTo(9.8009f, 2.6225f, 10.8456f, 2.0002f, 11.9999f, 2.0002f)
                curveTo(13.1542f, 2.0002f, 14.1988f, 2.6225f, 16.2881f, 3.867f)
                lineTo(17.673f, 4.692f)
                curveTo(19.9737f, 6.0625f, 21.1241f, 6.7478f, 21.6645f, 7.8751f)
                curveTo(22.205f, 9.0025f, 22.0153f, 10.321f, 21.6358f, 12.9581f)
                lineTo(21.357f, 14.8954f)
                curveTo(20.8696f, 18.2828f, 20.6259f, 19.9766f, 19.4509f, 20.9884f)
                curveTo(18.3821f, 21.9086f, 16.8598f, 21.9919f, 13.9999f, 21.9994f)
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
        return _smartHomeAngle!!
    }

private var _smartHomeAngle: ImageVector? = null
