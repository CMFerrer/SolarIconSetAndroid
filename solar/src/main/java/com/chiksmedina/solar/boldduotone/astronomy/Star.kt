package com.chiksmedina.solar.boldduotone.astronomy

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
import com.chiksmedina.solar.boldduotone.AstronomyGroup

val AstronomyGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(
            name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 3.25f)
                curveTo(12.4142f, 3.25f, 12.75f, 3.5858f, 12.75f, 4.0f)
                verticalLineTo(6.4f)
                curveTo(12.75f, 6.8142f, 12.4142f, 7.15f, 12.0f, 7.15f)
                curveTo(11.5858f, 7.15f, 11.25f, 6.8142f, 11.25f, 6.4f)
                verticalLineTo(4.0f)
                curveTo(11.25f, 3.5858f, 11.5858f, 3.25f, 12.0f, 3.25f)
                close()
                moveTo(3.25f, 12.0f)
                curveTo(3.25f, 11.5858f, 3.5858f, 11.25f, 4.0f, 11.25f)
                horizontalLineTo(6.4f)
                curveTo(6.8142f, 11.25f, 7.15f, 11.5858f, 7.15f, 12.0f)
                curveTo(7.15f, 12.4142f, 6.8142f, 12.75f, 6.4f, 12.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 12.75f, 3.25f, 12.4142f, 3.25f, 12.0f)
                close()
                moveTo(16.85f, 12.0f)
                curveTo(16.85f, 11.5858f, 17.1858f, 11.25f, 17.6f, 11.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 11.25f, 20.75f, 11.5858f, 20.75f, 12.0f)
                curveTo(20.75f, 12.4142f, 20.4142f, 12.75f, 20.0f, 12.75f)
                horizontalLineTo(17.6f)
                curveTo(17.1858f, 12.75f, 16.85f, 12.4142f, 16.85f, 12.0f)
                close()
                moveTo(12.0f, 16.85f)
                curveTo(12.4142f, 16.85f, 12.75f, 17.1858f, 12.75f, 17.6f)
                verticalLineTo(20.0f)
                curveTo(12.75f, 20.4142f, 12.4142f, 20.75f, 12.0f, 20.75f)
                curveTo(11.5858f, 20.75f, 11.25f, 20.4142f, 11.25f, 20.0f)
                verticalLineTo(17.6f)
                curveTo(11.25f, 17.1858f, 11.5858f, 16.85f, 12.0f, 16.85f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.187f, 5.8124f)
                curveTo(18.4799f, 6.1053f, 18.4799f, 6.5802f, 18.187f, 6.8731f)
                lineTo(16.49f, 8.5702f)
                curveTo(16.1971f, 8.8631f, 15.7222f, 8.8631f, 15.4293f, 8.5702f)
                curveTo(15.1364f, 8.2773f, 15.1364f, 7.8024f, 15.4293f, 7.5095f)
                lineTo(17.1264f, 5.8124f)
                curveTo(17.4193f, 5.5195f, 17.8941f, 5.5195f, 18.187f, 5.8124f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.8124f, 5.8126f)
                curveTo(6.1053f, 5.5197f, 6.5802f, 5.5197f, 6.8731f, 5.8126f)
                lineTo(8.5702f, 7.5097f)
                curveTo(8.8631f, 7.8026f, 8.8631f, 8.2774f, 8.5702f, 8.5703f)
                curveTo(8.2773f, 8.8632f, 7.8024f, 8.8632f, 7.5095f, 8.5703f)
                lineTo(5.8124f, 6.8733f)
                curveTo(5.5195f, 6.5804f, 5.5195f, 6.1055f, 5.8124f, 5.8126f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.5704f, 15.4291f)
                curveTo(8.8633f, 15.722f, 8.8633f, 16.1969f, 8.5704f, 16.4898f)
                lineTo(6.8733f, 18.1868f)
                curveTo(6.5804f, 18.4797f, 6.1055f, 18.4797f, 5.8127f, 18.1868f)
                curveTo(5.5198f, 17.8939f, 5.5198f, 17.419f, 5.8127f, 17.1262f)
                lineTo(7.5097f, 15.4291f)
                curveTo(7.8026f, 15.1362f, 8.2775f, 15.1362f, 8.5704f, 15.4291f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.4291f, 15.4293f)
                curveTo(15.722f, 15.1364f, 16.1969f, 15.1364f, 16.4898f, 15.4293f)
                lineTo(18.1868f, 17.1263f)
                curveTo(18.4797f, 17.4192f, 18.4797f, 17.8941f, 18.1868f, 18.187f)
                curveTo(17.8939f, 18.4799f, 17.419f, 18.4799f, 17.1262f, 18.187f)
                lineTo(15.4291f, 16.4899f)
                curveTo(15.1362f, 16.197f, 15.1362f, 15.7222f, 15.4291f, 15.4293f)
                close()
            }
        }
            .build()
        return _star!!
    }

private var _star: ImageVector? = null
