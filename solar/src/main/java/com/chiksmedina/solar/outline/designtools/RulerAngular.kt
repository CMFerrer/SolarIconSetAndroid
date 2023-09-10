package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

val DesignToolsGroup.RulerAngular: ImageVector
    get() {
        if (_rulerAngular != null) {
            return _rulerAngular!!
        }
        _rulerAngular = Builder(
            name = "RulerAngular", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.948f, 1.25f)
                lineTo(8.9992f, 1.25f)
                curveTo(8.9995f, 1.25f, 8.9989f, 1.25f, 8.9992f, 1.25f)
                curveTo(8.9995f, 1.25f, 9.0005f, 1.25f, 9.0008f, 1.25f)
                horizontalLineTo(11.9993f)
                curveTo(11.9996f, 1.25f, 11.9991f, 1.25f, 11.9993f, 1.25f)
                curveTo(11.9996f, 1.25f, 12.0005f, 1.25f, 12.0007f, 1.25f)
                horizontalLineTo(14.9995f)
                curveTo(14.9997f, 1.25f, 14.9993f, 1.25f, 14.9995f, 1.25f)
                curveTo(14.9997f, 1.25f, 15.0004f, 1.25f, 15.0005f, 1.25f)
                lineTo(18.5383f, 1.25f)
                curveTo(19.2079f, 1.25f, 19.7667f, 1.25f, 20.219f, 1.296f)
                curveTo(20.6925f, 1.3441f, 21.1318f, 1.4489f, 21.5278f, 1.7135f)
                curveTo(21.8281f, 1.9141f, 22.0859f, 2.1719f, 22.2865f, 2.4722f)
                curveTo(22.5511f, 2.8682f, 22.6559f, 3.3075f, 22.704f, 3.781f)
                curveTo(22.75f, 4.2334f, 22.75f, 4.7921f, 22.75f, 5.4617f)
                verticalLineTo(5.5383f)
                curveTo(22.75f, 6.2079f, 22.75f, 6.7667f, 22.704f, 7.219f)
                curveTo(22.6559f, 7.6925f, 22.5511f, 8.1318f, 22.2865f, 8.5278f)
                curveTo(22.0859f, 8.8281f, 21.8281f, 9.0859f, 21.5278f, 9.2865f)
                curveTo(21.1318f, 9.5511f, 20.6925f, 9.6559f, 20.219f, 9.704f)
                curveTo(19.7666f, 9.75f, 19.2079f, 9.75f, 18.5383f, 9.75f)
                lineTo(11.0f, 9.75f)
                curveTo(10.5074f, 9.75f, 10.2134f, 9.7516f, 10.0027f, 9.7799f)
                curveTo(9.9061f, 9.7929f, 9.8577f, 9.8082f, 9.836f, 9.8172f)
                curveTo(9.8309f, 9.8192f, 9.8276f, 9.8209f, 9.8257f, 9.8219f)
                lineTo(9.8232f, 9.8232f)
                lineTo(9.8219f, 9.8257f)
                curveTo(9.8209f, 9.8276f, 9.8192f, 9.8309f, 9.8172f, 9.836f)
                curveTo(9.8082f, 9.8577f, 9.7929f, 9.9061f, 9.7799f, 10.0027f)
                curveTo(9.7516f, 10.2134f, 9.75f, 10.5074f, 9.75f, 11.0f)
                lineTo(9.75f, 18.5383f)
                curveTo(9.75f, 19.2079f, 9.75f, 19.7666f, 9.704f, 20.219f)
                curveTo(9.6559f, 20.6925f, 9.5511f, 21.1318f, 9.2865f, 21.5278f)
                curveTo(9.0859f, 21.8281f, 8.8281f, 22.0859f, 8.5278f, 22.2865f)
                curveTo(8.1318f, 22.5511f, 7.6925f, 22.6559f, 7.219f, 22.704f)
                curveTo(6.7667f, 22.75f, 6.2079f, 22.75f, 5.5383f, 22.75f)
                horizontalLineTo(5.4617f)
                curveTo(4.7921f, 22.75f, 4.2334f, 22.75f, 3.781f, 22.704f)
                curveTo(3.3075f, 22.6559f, 2.8682f, 22.5511f, 2.4722f, 22.2865f)
                curveTo(2.1719f, 22.0859f, 1.9141f, 21.8281f, 1.7135f, 21.5278f)
                curveTo(1.4489f, 21.1318f, 1.3441f, 20.6925f, 1.296f, 20.219f)
                curveTo(1.25f, 19.7667f, 1.25f, 19.2079f, 1.25f, 18.5383f)
                lineTo(1.25f, 5.948f)
                curveTo(1.25f, 5.0495f, 1.25f, 4.3003f, 1.3299f, 3.7055f)
                curveTo(1.4143f, 3.0777f, 1.6f, 2.5109f, 2.0555f, 2.0555f)
                curveTo(2.5109f, 1.6f, 3.0777f, 1.4143f, 3.7055f, 1.3299f)
                curveTo(4.3003f, 1.25f, 5.0495f, 1.25f, 5.948f, 1.25f)
                close()
                moveTo(2.75f, 9.75f)
                horizontalLineTo(5.0f)
                curveTo(5.4142f, 9.75f, 5.75f, 9.4142f, 5.75f, 9.0f)
                curveTo(5.75f, 8.5858f, 5.4142f, 8.25f, 5.0f, 8.25f)
                horizontalLineTo(2.75f)
                verticalLineTo(6.0f)
                curveTo(2.75f, 5.036f, 2.7516f, 4.3884f, 2.8165f, 3.9054f)
                curveTo(2.8786f, 3.4439f, 2.9858f, 3.2464f, 3.1161f, 3.1161f)
                curveTo(3.2464f, 2.9858f, 3.4439f, 2.8786f, 3.9054f, 2.8165f)
                curveTo(4.3884f, 2.7516f, 5.036f, 2.75f, 6.0f, 2.75f)
                horizontalLineTo(8.25f)
                lineTo(8.25f, 5.0f)
                curveTo(8.25f, 5.4142f, 8.5858f, 5.75f, 9.0f, 5.75f)
                curveTo(9.4142f, 5.75f, 9.75f, 5.4142f, 9.75f, 5.0f)
                lineTo(9.75f, 2.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(4.0f)
                curveTo(11.25f, 4.4142f, 11.5858f, 4.75f, 12.0f, 4.75f)
                curveTo(12.4142f, 4.75f, 12.75f, 4.4142f, 12.75f, 4.0f)
                verticalLineTo(2.75f)
                horizontalLineTo(14.25f)
                verticalLineTo(5.0f)
                curveTo(14.25f, 5.4142f, 14.5858f, 5.75f, 15.0f, 5.75f)
                curveTo(15.4142f, 5.75f, 15.75f, 5.4142f, 15.75f, 5.0f)
                verticalLineTo(2.75f)
                horizontalLineTo(17.25f)
                verticalLineTo(4.0f)
                curveTo(17.25f, 4.4142f, 17.5858f, 4.75f, 18.0f, 4.75f)
                curveTo(18.4142f, 4.75f, 18.75f, 4.4142f, 18.75f, 4.0f)
                verticalLineTo(2.7501f)
                curveTo(19.3326f, 2.7508f, 19.7441f, 2.7554f, 20.0672f, 2.7883f)
                curveTo(20.422f, 2.8244f, 20.586f, 2.8882f, 20.6945f, 2.9607f)
                curveTo(20.831f, 3.0519f, 20.9481f, 3.169f, 21.0393f, 3.3055f)
                curveTo(21.1118f, 3.414f, 21.1756f, 3.578f, 21.2117f, 3.9328f)
                curveTo(21.2491f, 4.3002f, 21.25f, 4.7822f, 21.25f, 5.5f)
                curveTo(21.25f, 6.2178f, 21.2491f, 6.6998f, 21.2117f, 7.0672f)
                curveTo(21.1756f, 7.422f, 21.1118f, 7.586f, 21.0393f, 7.6945f)
                curveTo(20.9481f, 7.8309f, 20.831f, 7.9481f, 20.6945f, 8.0393f)
                curveTo(20.586f, 8.1118f, 20.422f, 8.1756f, 20.0672f, 8.2117f)
                curveTo(19.6998f, 8.2491f, 19.2178f, 8.25f, 18.5f, 8.25f)
                horizontalLineTo(11.0f)
                curveTo(10.985f, 8.25f, 10.9701f, 8.25f, 10.9553f, 8.25f)
                curveTo(10.5224f, 8.25f, 10.1256f, 8.2499f, 9.8028f, 8.2933f)
                curveTo(9.4473f, 8.3411f, 9.0716f, 8.4535f, 8.7626f, 8.7626f)
                curveTo(8.4535f, 9.0716f, 8.3411f, 9.4473f, 8.2933f, 9.8028f)
                curveTo(8.2499f, 10.1256f, 8.25f, 10.5224f, 8.25f, 10.9553f)
                curveTo(8.25f, 10.9701f, 8.25f, 10.985f, 8.25f, 11.0f)
                verticalLineTo(18.5f)
                curveTo(8.25f, 19.2178f, 8.2491f, 19.6998f, 8.2117f, 20.0672f)
                curveTo(8.1756f, 20.422f, 8.1118f, 20.586f, 8.0393f, 20.6945f)
                curveTo(7.9481f, 20.831f, 7.8309f, 20.9481f, 7.6945f, 21.0393f)
                curveTo(7.586f, 21.1118f, 7.422f, 21.1756f, 7.0672f, 21.2117f)
                curveTo(6.6998f, 21.2491f, 6.2178f, 21.25f, 5.5f, 21.25f)
                curveTo(4.7822f, 21.25f, 4.3002f, 21.2491f, 3.9328f, 21.2117f)
                curveTo(3.578f, 21.1756f, 3.414f, 21.1118f, 3.3055f, 21.0393f)
                curveTo(3.169f, 20.9481f, 3.0519f, 20.831f, 2.9607f, 20.6945f)
                curveTo(2.8882f, 20.586f, 2.8244f, 20.422f, 2.7883f, 20.0672f)
                curveTo(2.7554f, 19.7441f, 2.7508f, 19.3326f, 2.7501f, 18.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 18.75f, 4.75f, 18.4142f, 4.75f, 18.0f)
                curveTo(4.75f, 17.5858f, 4.4142f, 17.25f, 4.0f, 17.25f)
                horizontalLineTo(2.75f)
                verticalLineTo(15.75f)
                lineTo(5.0f, 15.75f)
                curveTo(5.4142f, 15.75f, 5.75f, 15.4142f, 5.75f, 15.0f)
                curveTo(5.75f, 14.5858f, 5.4142f, 14.25f, 5.0f, 14.25f)
                lineTo(2.75f, 14.25f)
                verticalLineTo(12.75f)
                horizontalLineTo(4.0f)
                curveTo(4.4142f, 12.75f, 4.75f, 12.4142f, 4.75f, 12.0f)
                curveTo(4.75f, 11.5858f, 4.4142f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(2.75f)
                verticalLineTo(9.75f)
                close()
            }
        }
            .build()
        return _rulerAngular!!
    }

private var _rulerAngular: ImageVector? = null
