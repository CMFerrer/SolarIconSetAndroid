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

val EssentionalUiGroup.CupFirst: ImageVector
    get() {
        if (_cupFirst != null) {
            return _cupFirst!!
        }
        _cupFirst = Builder(
            name = "CupFirst", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0002f, 16.0f)
                curveTo(6.2402f, 16.0f, 5.2198f, 10.2595f, 5.0391f, 5.7065f)
                curveTo(4.9888f, 4.44f, 4.9637f, 3.8067f, 5.4394f, 3.2208f)
                curveTo(5.9151f, 2.6349f, 6.4844f, 2.5389f, 7.6232f, 2.3467f)
                curveTo(8.7472f, 2.1571f, 10.2166f, 2.0f, 12.0002f, 2.0f)
                curveTo(13.7837f, 2.0f, 15.2531f, 2.1571f, 16.3771f, 2.3467f)
                curveTo(17.5159f, 2.5389f, 18.0852f, 2.6349f, 18.5609f, 3.2208f)
                curveTo(19.0367f, 3.8067f, 19.0115f, 4.44f, 18.9612f, 5.7065f)
                curveTo(18.7805f, 10.2595f, 17.7601f, 16.0f, 12.0002f, 16.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.0f, 8.0f)
                lineTo(12.5f, 6.5f)
                verticalLineTo(10.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 5.0f)
                lineTo(19.9486f, 5.3162f)
                curveTo(20.9387f, 5.6462f, 21.4337f, 5.8112f, 21.7168f, 6.2041f)
                curveTo(22.0f, 6.5969f, 22.0f, 7.1187f, 21.9999f, 8.1623f)
                lineTo(21.9999f, 8.2349f)
                curveTo(21.9999f, 9.0956f, 21.9999f, 9.526f, 21.7927f, 9.8781f)
                curveTo(21.5855f, 10.2302f, 21.2093f, 10.4392f, 20.4569f, 10.8572f)
                lineTo(17.5f, 12.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.9999f, 5.0f)
                lineTo(4.0513f, 5.3162f)
                curveTo(3.0613f, 5.6462f, 2.5662f, 5.8112f, 2.2831f, 6.2041f)
                curveTo(2.0f, 6.5969f, 2.0f, 7.1187f, 2.0f, 8.1623f)
                lineTo(2.0f, 8.2349f)
                curveTo(2.0f, 9.0956f, 2.0f, 9.526f, 2.2072f, 9.8781f)
                curveTo(2.4144f, 10.2302f, 2.7906f, 10.4392f, 3.5431f, 10.8572f)
                lineTo(6.4999f, 12.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 16.0f)
                verticalLineTo(19.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 22.0f)
                horizontalLineTo(8.5f)
                lineTo(8.8392f, 20.3039f)
                curveTo(8.9327f, 19.8365f, 9.3431f, 19.5f, 9.8198f, 19.5f)
                horizontalLineTo(14.1802f)
                curveTo(14.6569f, 19.5f, 15.0673f, 19.8365f, 15.1608f, 20.3039f)
                lineTo(15.5f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
            }
        }
            .build()
        return _cupFirst!!
    }

private var _cupFirst: ImageVector? = null
