package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.RepeatOneMinimalistic: ImageVector
    get() {
        if (_repeatOneMinimalistic != null) {
            return _repeatOneMinimalistic!!
        }
        _repeatOneMinimalistic = Builder(
            name = "RepeatOneMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.716f, 3.2028f)
                curveTo(8.9884f, 2.9324f, 9.4302f, 2.9324f, 9.7026f, 3.2028f)
                lineTo(11.5631f, 5.0489f)
                curveTo(11.7626f, 5.2469f, 11.8223f, 5.5447f, 11.7143f, 5.8034f)
                curveTo(11.6063f, 6.0621f, 11.352f, 6.2308f, 11.0698f, 6.2308f)
                horizontalLineTo(9.2093f)
                curveTo(5.9983f, 6.2308f, 3.3953f, 8.8137f, 3.3953f, 12.0f)
                curveTo(3.3953f, 15.1862f, 5.9986f, 17.7692f, 9.2096f, 17.7692f)
                horizontalLineTo(9.6744f)
                curveTo(10.0597f, 17.7692f, 10.3721f, 18.0792f, 10.3721f, 18.4615f)
                curveTo(10.3721f, 18.8439f, 10.0597f, 19.1538f, 9.6744f, 19.1538f)
                horizontalLineTo(9.2096f)
                curveTo(5.228f, 19.1538f, 2.0f, 15.951f, 2.0f, 12.0f)
                curveTo(2.0f, 8.049f, 5.2277f, 4.8461f, 9.2093f, 4.8461f)
                horizontalLineTo(9.3854f)
                lineTo(8.716f, 4.1818f)
                curveTo(8.4435f, 3.9115f, 8.4435f, 3.4731f, 8.716f, 3.2028f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.6279f, 5.5385f)
                curveTo(13.6279f, 5.1561f, 13.9403f, 4.8461f, 14.3256f, 4.8461f)
                horizontalLineTo(14.7907f)
                curveTo(18.7723f, 4.8461f, 22.0f, 8.049f, 22.0f, 12.0f)
                curveTo(22.0f, 15.951f, 18.7723f, 19.1538f, 14.7907f, 19.1538f)
                horizontalLineTo(14.6146f)
                lineTo(15.284f, 19.8182f)
                curveTo(15.5565f, 20.0885f, 15.5565f, 20.5269f, 15.284f, 20.7972f)
                curveTo(15.0116f, 21.0676f, 14.5698f, 21.0676f, 14.2974f, 20.7972f)
                lineTo(12.4369f, 18.9511f)
                curveTo(12.2374f, 18.7531f, 12.1777f, 18.4553f, 12.2857f, 18.1966f)
                curveTo(12.3937f, 17.9379f, 12.648f, 17.7692f, 12.9302f, 17.7692f)
                horizontalLineTo(14.7907f)
                curveTo(18.0017f, 17.7692f, 20.6047f, 15.1863f, 20.6047f, 12.0f)
                curveTo(20.6047f, 8.8137f, 18.0017f, 6.2308f, 14.7907f, 6.2308f)
                horizontalLineTo(14.3256f)
                curveTo(13.9403f, 6.2308f, 13.6279f, 5.9208f, 13.6279f, 5.5385f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4884f, 12.0f)
                curveTo(5.4884f, 9.9608f, 7.1543f, 8.3077f, 9.2093f, 8.3077f)
                horizontalLineTo(14.7907f)
                curveTo(16.8457f, 8.3077f, 18.5116f, 9.9608f, 18.5116f, 12.0f)
                curveTo(18.5116f, 14.0392f, 16.8457f, 15.6923f, 14.7907f, 15.6923f)
                horizontalLineTo(9.2093f)
                curveTo(7.1543f, 15.6923f, 5.4884f, 14.0392f, 5.4884f, 12.0f)
                close()
            }
        }
            .build()
        return _repeatOneMinimalistic!!
    }

private var _repeatOneMinimalistic: ImageVector? = null
