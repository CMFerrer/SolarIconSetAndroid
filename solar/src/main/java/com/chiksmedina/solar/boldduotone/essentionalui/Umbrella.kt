package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5238f, 12.0f)
                horizontalLineTo(12.0f)
                horizontalLineTo(2.4762f)
                curveTo(2.2132f, 12.0f, 2.0f, 11.7868f, 2.0f, 11.5238f)
                curveTo(2.0f, 6.264f, 6.2639f, 2.0f, 11.5238f, 2.0f)
                horizontalLineTo(12.4762f)
                curveTo(17.736f, 2.0f, 22.0f, 6.264f, 22.0f, 11.5238f)
                curveTo(22.0f, 11.7868f, 21.7868f, 12.0f, 21.5238f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.25f, 20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(20.0f)
                curveTo(12.75f, 21.5188f, 11.5188f, 22.75f, 10.0f, 22.75f)
                curveTo(8.4812f, 22.75f, 7.25f, 21.5188f, 7.25f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(7.25f, 18.5858f, 7.5858f, 18.25f, 8.0f, 18.25f)
                curveTo(8.4142f, 18.25f, 8.75f, 18.5858f, 8.75f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(8.75f, 20.6904f, 9.3096f, 21.25f, 10.0f, 21.25f)
                curveTo(10.6904f, 21.25f, 11.25f, 20.6904f, 11.25f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8401f, 12.0f)
                curveTo(7.9827f, 10.6457f, 8.3168f, 8.2674f, 9.0236f, 6.229f)
                curveTo(9.3849f, 5.1873f, 9.8257f, 4.2879f, 10.3482f, 3.6617f)
                curveTo(10.862f, 3.0459f, 11.4029f, 2.75f, 12.0003f, 2.75f)
                curveTo(12.5977f, 2.75f, 13.1386f, 3.0459f, 13.6524f, 3.6617f)
                curveTo(14.1749f, 4.2879f, 14.6157f, 5.1873f, 14.9769f, 6.229f)
                curveTo(15.6838f, 8.2674f, 16.0179f, 10.6457f, 16.1605f, 12.0f)
                horizontalLineTo(17.6685f)
                lineTo(17.6606f, 11.9232f)
                curveTo(17.5194f, 10.5516f, 17.1725f, 7.9822f, 16.3941f, 5.7375f)
                curveTo(16.006f, 4.6181f, 15.4927f, 3.5259f, 14.8041f, 2.7007f)
                curveTo(14.647f, 2.5124f, 14.4783f, 2.3354f, 14.2976f, 2.174f)
                curveTo(13.708f, 2.0598f, 13.0991f, 2.0f, 12.4762f, 2.0f)
                horizontalLineTo(11.5239f)
                curveTo(10.9012f, 2.0f, 10.2925f, 2.0598f, 9.7031f, 2.1739f)
                curveTo(9.5224f, 2.3353f, 9.3536f, 2.5124f, 9.1964f, 2.7007f)
                curveTo(8.5079f, 3.5259f, 7.9946f, 4.6181f, 7.6064f, 5.7375f)
                curveTo(6.828f, 7.9822f, 6.4812f, 10.5516f, 6.3399f, 11.9232f)
                lineTo(6.332f, 12.0f)
                horizontalLineTo(7.8401f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
