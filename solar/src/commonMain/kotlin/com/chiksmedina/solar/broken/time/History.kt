package com.chiksmedina.solar.broken.time

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
import com.chiksmedina.solar.broken.TimeGroup

val TimeGroup.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(
            name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(12.0f)
                lineTo(14.5f, 14.5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.6042f, 5.6042f)
                lineTo(5.0739f, 5.0739f)
                lineTo(5.0739f, 5.0739f)
                lineTo(5.6042f, 5.6042f)
                close()
                moveTo(4.3379f, 6.8706f)
                lineTo(3.5879f, 6.8744f)
                curveTo(3.5899f, 7.2856f, 3.9228f, 7.6185f, 4.3341f, 7.6206f)
                lineTo(4.3379f, 6.8706f)
                close()
                moveTo(6.8796f, 7.6334f)
                curveTo(7.2938f, 7.6355f, 7.6313f, 7.3014f, 7.6334f, 6.8872f)
                curveTo(7.6355f, 6.473f, 7.3014f, 6.1355f, 6.8872f, 6.1334f)
                lineTo(6.8796f, 7.6334f)
                close()
                moveTo(5.075f, 4.3213f)
                curveTo(5.073f, 3.9071f, 4.7355f, 3.573f, 4.3213f, 3.5751f)
                curveTo(3.9071f, 3.5772f, 3.573f, 3.9146f, 3.5751f, 4.3288f)
                lineTo(5.075f, 4.3213f)
                close()
                moveTo(3.75f, 12.0f)
                curveTo(3.75f, 11.5858f, 3.4142f, 11.25f, 3.0f, 11.25f)
                curveTo(2.5858f, 11.25f, 2.25f, 11.5858f, 2.25f, 12.0f)
                horizontalLineTo(3.75f)
                close()
                moveTo(16.8755f, 20.4452f)
                curveTo(17.2341f, 20.2378f, 17.3566f, 19.779f, 17.1492f, 19.4204f)
                curveTo(16.9418f, 19.0619f, 16.483f, 18.9393f, 16.1245f, 19.1468f)
                lineTo(16.8755f, 20.4452f)
                close()
                moveTo(19.1468f, 16.1245f)
                curveTo(18.9393f, 16.483f, 19.0619f, 16.9418f, 19.4204f, 17.1492f)
                curveTo(19.779f, 17.3566f, 20.2378f, 17.2341f, 20.4452f, 16.8755f)
                lineTo(19.1468f, 16.1245f)
                close()
                moveTo(5.1403f, 5.0713f)
                curveTo(4.846f, 5.3627f, 4.8436f, 5.8376f, 5.135f, 6.1319f)
                curveTo(5.4265f, 6.4263f, 5.9013f, 6.4286f, 6.1957f, 6.1372f)
                lineTo(5.1403f, 5.0713f)
                close()
                moveTo(18.8623f, 5.1379f)
                curveTo(15.0421f, 1.3177f, 8.8688f, 1.279f, 5.0739f, 5.0739f)
                lineTo(6.1346f, 6.1346f)
                curveTo(9.3337f, 2.9355f, 14.5572f, 2.954f, 17.8017f, 6.1985f)
                lineTo(18.8623f, 5.1379f)
                close()
                moveTo(5.0739f, 5.0739f)
                lineTo(3.8075f, 6.3403f)
                lineTo(4.8682f, 7.4009f)
                lineTo(6.1346f, 6.1346f)
                lineTo(5.0739f, 5.0739f)
                close()
                moveTo(4.3341f, 7.6206f)
                lineTo(6.8796f, 7.6334f)
                lineTo(6.8872f, 6.1334f)
                lineTo(4.3416f, 6.1206f)
                lineTo(4.3341f, 7.6206f)
                close()
                moveTo(5.0878f, 6.8668f)
                lineTo(5.075f, 4.3213f)
                lineTo(3.5751f, 4.3288f)
                lineTo(3.5879f, 6.8744f)
                lineTo(5.0878f, 6.8668f)
                close()
                moveTo(12.0f, 3.75f)
                curveTo(16.5563f, 3.75f, 20.25f, 7.4436f, 20.25f, 12.0f)
                horizontalLineTo(21.75f)
                curveTo(21.75f, 6.6152f, 17.3848f, 2.25f, 12.0f, 2.25f)
                verticalLineTo(3.75f)
                close()
                moveTo(12.0f, 20.25f)
                curveTo(7.4436f, 20.25f, 3.75f, 16.5563f, 3.75f, 12.0f)
                horizontalLineTo(2.25f)
                curveTo(2.25f, 17.3848f, 6.6152f, 21.75f, 12.0f, 21.75f)
                verticalLineTo(20.25f)
                close()
                moveTo(16.1245f, 19.1468f)
                curveTo(14.9118f, 19.8483f, 13.5039f, 20.25f, 12.0f, 20.25f)
                verticalLineTo(21.75f)
                curveTo(13.7747f, 21.75f, 15.4407f, 21.2752f, 16.8755f, 20.4452f)
                lineTo(16.1245f, 19.1468f)
                close()
                moveTo(20.25f, 12.0f)
                curveTo(20.25f, 13.5039f, 19.8483f, 14.9118f, 19.1468f, 16.1245f)
                lineTo(20.4452f, 16.8755f)
                curveTo(21.2752f, 15.4407f, 21.75f, 13.7747f, 21.75f, 12.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(6.1957f, 6.1372f)
                curveTo(7.6871f, 4.6606f, 9.7365f, 3.75f, 12.0f, 3.75f)
                verticalLineTo(2.25f)
                curveTo(9.3254f, 2.25f, 6.9011f, 3.3279f, 5.1403f, 5.0713f)
                lineTo(6.1957f, 6.1372f)
                close()
            }
        }
            .build()
        return _history!!
    }

private var _history: ImageVector? = null
