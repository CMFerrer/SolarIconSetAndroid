package com.chiksmedina.solar.broken.sports

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
import com.chiksmedina.solar.broken.SportsGroup

val SportsGroup.Balls: ImageVector
    get() {
        if (_balls != null) {
            return _balls!!
        }
        _balls = Builder(
            name = "Balls", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0201f, 8.0768f)
                curveTo(14.0016f, 8.271f, 11.8566f, 8.8763f, 10.3665f, 10.3665f)
                curveTo(8.8763f, 11.8566f, 8.271f, 14.0016f, 8.0768f, 16.0201f)
                moveTo(16.0201f, 8.0768f)
                curveTo(17.1891f, 7.9644f, 18.3157f, 7.9898f, 19.248f, 8.0611f)
                curveTo(20.7038f, 8.1724f, 21.8276f, 9.2962f, 21.9389f, 10.752f)
                curveTo(22.0102f, 11.6843f, 22.0356f, 12.8109f, 21.9232f, 13.9799f)
                moveTo(16.0201f, 8.0768f)
                lineTo(21.9232f, 13.9799f)
                moveTo(21.9232f, 13.9799f)
                curveTo(21.729f, 15.9984f, 21.1237f, 18.1434f, 19.6336f, 19.6336f)
                curveTo(18.1434f, 21.1237f, 15.9984f, 21.729f, 13.9799f, 21.9232f)
                moveTo(13.9799f, 21.9232f)
                curveTo(12.8109f, 22.0356f, 11.6843f, 22.0102f, 10.752f, 21.9389f)
                curveTo(9.2962f, 21.8276f, 8.1724f, 20.7038f, 8.0611f, 19.248f)
                curveTo(7.9898f, 18.3157f, 7.9644f, 17.1891f, 8.0768f, 16.0201f)
                moveTo(13.9799f, 21.9232f)
                lineTo(8.0768f, 16.0201f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.9955f, 8.252f)
                curveTo(14.9573f, 7.2286f, 14.6759f, 6.1992f, 14.1282f, 5.2505f)
                curveTo(13.0651f, 3.4092f, 11.237f, 2.2849f, 9.2771f, 2.0473f)
                curveTo(7.9285f, 1.8839f, 6.5176f, 2.1402f, 5.2505f, 2.8718f)
                curveTo(2.1422f, 4.6664f, 1.0771f, 8.6411f, 2.8718f, 11.7495f)
                curveTo(4.0132f, 13.7265f, 6.0366f, 14.8769f, 8.158f, 14.9907f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.2151f, 2.0f)
                curveTo(9.2151f, 2.0f, 9.0766f, 4.3559f, 10.5717f, 7.1907f)
                curveTo(11.0294f, 8.0585f, 11.5282f, 8.7588f, 12.0f, 9.3127f)
                moveTo(3.0f, 5.9279f)
                curveTo(3.0f, 5.9279f, 4.9331f, 6.9746f, 6.4283f, 9.8093f)
                curveTo(7.9234f, 12.6441f, 7.7849f, 15.0f, 7.7849f, 15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.5f, 17.5f)
                lineTo(17.5f, 12.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 12.5f)
                lineTo(17.5f, 14.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.5f, 15.5f)
                lineTo(14.5f, 17.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 14.0f)
                lineTo(16.0f, 16.0f)
            }
        }
            .build()
        return _balls!!
    }

private var _balls: ImageVector? = null
