package com.chiksmedina.solar.linear.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.EssentionalUiGroup

val EssentionalUiGroup.Perfume: ImageVector
    get() {
        if (_perfume != null) {
            return _perfume!!
        }
        _perfume = Builder(
            name = "Perfume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 5.4217f)
                verticalLineTo(5.0f)
                curveTo(7.0f, 3.5858f, 7.0f, 2.8787f, 7.4393f, 2.4393f)
                curveTo(7.8787f, 2.0f, 8.5858f, 2.0f, 10.0f, 2.0f)
                curveTo(11.4142f, 2.0f, 12.1213f, 2.0f, 12.5607f, 2.4393f)
                curveTo(13.0f, 2.8787f, 13.0f, 3.5858f, 13.0f, 5.0f)
                verticalLineTo(5.4217f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0f, 7.0f)
                horizontalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 5.0002f)
                curveTo(7.5523f, 5.0002f, 8.0f, 5.0523f, 8.0f, 4.5f)
                curveTo(8.0f, 3.9477f, 7.5523f, 4.0003f, 7.0f, 4.0003f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 7.0f)
                curveTo(5.5817f, 7.0f, 2.0f, 10.3556f, 2.0f, 14.495f)
                curveTo(2.0f, 16.4098f, 2.7664f, 18.1569f, 4.0275f, 19.4817f)
                curveTo(4.4777f, 19.9546f, 4.7027f, 20.191f, 5.6462f, 20.5955f)
                curveTo(6.5898f, 21.0f, 7.2404f, 21.0f, 8.5416f, 21.0f)
                horizontalLineTo(11.4584f)
                curveTo(12.7596f, 21.0f, 13.4102f, 21.0f, 14.3538f, 20.5955f)
                curveTo(15.2973f, 20.191f, 15.5224f, 19.9546f, 15.9725f, 19.4817f)
                curveTo(17.2336f, 18.1569f, 18.0f, 16.4098f, 18.0f, 14.495f)
                curveTo(18.0f, 10.3556f, 14.4183f, 7.0f, 10.0f, 7.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.5f, 13.0f)
                curveTo(3.935f, 13.5805f, 5.6429f, 14.7308f, 7.8607f, 14.9805f)
                curveTo(10.856f, 15.3178f, 12.4244f, 12.8237f, 15.3979f, 13.3176f)
                curveTo(16.446f, 13.4917f, 17.4232f, 13.7921f, 18.0f, 14.112f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.5f, 5.0f)
                horizontalLineTo(14.3197f)
                curveTo(15.0959f, 5.0f, 15.8615f, 5.1807f, 16.5557f, 5.5279f)
                lineTo(17.5f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5f, 5.2498f)
                curveTo(21.6958f, 5.9401f, 22.2174f, 7.2752f, 21.6651f, 8.2318f)
                curveTo(21.1128f, 9.1884f, 19.6958f, 9.4042f, 18.5f, 8.7139f)
                curveTo(17.3043f, 8.0235f, 16.7827f, 6.6884f, 17.335f, 5.7318f)
                curveTo(17.8872f, 4.7752f, 19.3043f, 4.5594f, 20.5f, 5.2498f)
                close()
            }
        }
            .build()
        return _perfume!!
    }

private var _perfume: ImageVector? = null
