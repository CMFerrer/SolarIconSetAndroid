package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Skirt: ImageVector
    get() {
        if (_skirt != null) {
            return _skirt!!
        }
        _skirt = Builder(
            name = "Skirt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.1083f, 2.0f)
                horizontalLineTo(7.8917f)
                curveTo(6.9234f, 2.0f, 6.4392f, 2.0f, 6.1384f, 2.2929f)
                curveTo(5.8376f, 2.5858f, 5.8376f, 3.0572f, 5.8376f, 4.0f)
                verticalLineTo(4.75f)
                horizontalLineTo(18.1624f)
                verticalLineTo(4.0f)
                curveTo(18.1624f, 3.0572f, 18.1624f, 2.5858f, 17.8616f, 2.2929f)
                curveTo(17.5608f, 2.0f, 17.0766f, 2.0f, 16.1083f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0807f, 17.9529f)
                lineTo(5.6113f, 6.25f)
                horizontalLineTo(9.0343f)
                lineTo(7.1473f, 21.4073f)
                curveTo(7.1434f, 21.4393f, 7.1415f, 21.471f, 7.1415f, 21.5024f)
                curveTo(5.046f, 21.0409f, 3.6009f, 20.3491f, 2.7345f, 19.8293f)
                curveTo(2.0822f, 19.4379f, 1.8647f, 18.6686f, 2.0807f, 17.9529f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.5932f, 21.7655f)
                curveTo(9.6063f, 21.9115f, 10.7401f, 22.0f, 12.0f, 22.0f)
                curveTo(13.2598f, 22.0f, 14.3935f, 21.9115f, 15.4066f, 21.7655f)
                curveTo(15.386f, 21.7109f, 15.3715f, 21.6531f, 15.3639f, 21.5927f)
                lineTo(13.4539f, 6.25f)
                horizontalLineTo(10.5459f)
                lineTo(8.6359f, 21.5927f)
                curveTo(8.6283f, 21.6531f, 8.6138f, 21.7109f, 8.5932f, 21.7655f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.9655f, 6.25f)
                lineTo(16.8524f, 21.4073f)
                curveTo(16.8564f, 21.4393f, 16.8583f, 21.4711f, 16.8583f, 21.5025f)
                curveTo(18.9539f, 21.041f, 20.3991f, 20.3491f, 21.2655f, 19.8293f)
                curveTo(21.9178f, 19.4379f, 22.1353f, 18.6686f, 21.9193f, 17.9529f)
                lineTo(18.3887f, 6.25f)
                horizontalLineTo(14.9655f)
                close()
            }
        }
            .build()
        return _skirt!!
    }

private var _skirt: ImageVector? = null
