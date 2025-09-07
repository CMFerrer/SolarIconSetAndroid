package com.chiksmedina.solar.boldduotone.essentionalui

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
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(
            name = "Help", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
                curveTo(16.0f, 9.7909f, 14.2091f, 8.0f, 12.0f, 8.0f)
                curveTo(9.7909f, 8.0f, 8.0f, 9.7909f, 8.0f, 12.0f)
                curveTo(8.0f, 14.2091f, 9.7909f, 16.0f, 12.0f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.4792f, 19.5817f)
                lineTo(9.752f, 15.309f)
                curveTo(9.3353f, 15.0253f, 8.975f, 14.665f, 8.6913f, 14.2484f)
                lineTo(4.4186f, 18.5211f)
                curveTo(4.7452f, 18.9005f, 5.0998f, 19.2551f, 5.4792f, 19.5817f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.4185f, 5.4791f)
                lineTo(8.6912f, 9.7518f)
                curveTo(8.9748f, 9.3351f, 9.3352f, 8.9748f, 9.7519f, 8.6911f)
                lineTo(5.4791f, 4.4184f)
                curveTo(5.0997f, 4.745f, 4.7451f, 5.0996f, 4.4185f, 5.4791f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.2484f, 8.6912f)
                lineTo(18.5211f, 4.4185f)
                curveTo(18.9005f, 4.7451f, 19.2551f, 5.0998f, 19.5818f, 5.4792f)
                lineTo(15.309f, 9.7519f)
                curveTo(15.0254f, 9.3352f, 14.6651f, 8.9749f, 14.2484f, 8.6912f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.5817f, 18.5209f)
                lineTo(15.3089f, 14.2482f)
                curveTo(15.0253f, 14.6649f, 14.665f, 15.0252f, 14.2483f, 15.3089f)
                lineTo(18.521f, 19.5816f)
                curveTo(18.9004f, 19.255f, 19.255f, 18.9004f, 19.5817f, 18.5209f)
                close()
            }
        }
            .build()
        return _help!!
    }

private var _help: ImageVector? = null
