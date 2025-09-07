package com.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Football: ImageVector
    get() {
        if (_football != null) {
            return _football!!
        }
        _football = Builder(
            name = "Football", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.658f, 3.2233f)
                lineTo(14.3376f, 4.1546f)
                curveTo(13.6404f, 4.6463f, 13.1571f, 4.9872f, 12.7387f, 5.1755f)
                verticalLineTo(9.5738f)
                lineTo(14.2887f, 10.7593f)
                lineTo(18.3858f, 9.0626f)
                curveTo(18.4193f, 8.6057f, 18.5719f, 8.0357f, 18.7915f, 7.2153f)
                lineTo(19.2095f, 5.6534f)
                lineTo(19.3212f, 5.2098f)
                curveTo(20.9695f, 6.993f, 21.9769f, 9.3787f, 21.9769f, 12.0f)
                curveTo(21.9769f, 12.1971f, 21.9712f, 12.3929f, 21.96f, 12.5872f)
                lineTo(20.4493f, 11.5886f)
                curveTo(19.7353f, 11.1166f, 19.2411f, 10.79f, 18.9132f, 10.4677f)
                lineTo(14.7009f, 12.2121f)
                lineTo(14.1186f, 14.0986f)
                lineTo(16.6986f, 17.0828f)
                curveTo(17.146f, 17.0f, 17.7315f, 17.0f, 18.5696f, 17.0f)
                horizontalLineTo(20.6406f)
                curveTo(19.2551f, 19.3979f, 16.9037f, 21.1663f, 14.1189f, 21.772f)
                lineTo(14.1917f, 21.5f)
                lineTo(14.7793f, 19.7351f)
                curveTo(15.0515f, 18.9175f, 15.2394f, 18.3531f, 15.4674f, 17.9522f)
                lineTo(12.9151f, 15.0f)
                horizontalLineTo(11.0415f)
                lineTo(8.7185f, 17.9583f)
                curveTo(8.9449f, 18.3588f, 9.1323f, 18.9216f, 9.4031f, 19.7351f)
                lineTo(9.9908f, 21.5f)
                lineTo(10.0999f, 21.8215f)
                curveTo(7.2097f, 21.2678f, 4.7617f, 19.467f, 3.3363f, 17.0f)
                horizontalLineTo(5.6128f)
                curveTo(6.4591f, 17.0f, 7.0478f, 17.0f, 7.4969f, 17.0852f)
                lineTo(9.8537f, 14.0838f)
                lineTo(9.2768f, 12.2149f)
                lineTo(5.1286f, 10.4667f)
                curveTo(4.8008f, 10.7893f, 4.3063f, 11.1161f, 3.5917f, 11.5885f)
                lineTo(2.041f, 12.6136f)
                lineTo(2.0194f, 12.6289f)
                curveTo(2.0065f, 12.421f, 2.0f, 12.2112f, 2.0f, 12.0f)
                curveTo(2.0f, 9.3592f, 3.0224f, 6.9576f, 4.6926f, 5.1701f)
                lineTo(4.8315f, 5.6533f)
                lineTo(5.2495f, 7.2152f)
                curveTo(5.4688f, 8.0346f, 5.6213f, 8.6042f, 5.655f, 9.0608f)
                lineTo(9.6872f, 10.7601f)
                lineTo(11.2387f, 9.5734f)
                verticalLineTo(5.1577f)
                curveTo(10.8253f, 4.96f, 10.3502f, 4.6093f, 9.6656f, 4.104f)
                lineTo(8.17f, 3.0f)
                lineTo(7.9628f, 2.8454f)
                curveTo(9.1943f, 2.3018f, 10.5562f, 2.0f, 11.9885f, 2.0f)
                curveTo(13.436f, 2.0f, 14.8117f, 2.3083f, 16.0534f, 2.8628f)
                lineTo(15.658f, 3.2233f)
                close()
            }
        }
            .build()
        return _football!!
    }

private var _football: ImageVector? = null
