package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.TrashBinMinimalistic: ImageVector
    get() {
        if (_trashBinMinimalistic != null) {
            return _trashBinMinimalistic!!
        }
        _trashBinMinimalistic = Builder(
            name = "TrashBinMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 6.5238f)
                curveTo(3.0f, 6.1293f, 3.3267f, 5.8095f, 3.7297f, 5.8095f)
                horizontalLineTo(8.5179f)
                curveTo(8.5244f, 4.9683f, 8.6155f, 3.815f, 9.4504f, 3.0167f)
                curveTo(10.1074f, 2.3884f, 11.0081f, 2.0f, 12.0f, 2.0f)
                curveTo(12.9919f, 2.0f, 13.8926f, 2.3884f, 14.5496f, 3.0167f)
                curveTo(15.3844f, 3.815f, 15.4756f, 4.9683f, 15.4821f, 5.8095f)
                horizontalLineTo(20.2703f)
                curveTo(20.6733f, 5.8095f, 21.0f, 6.1293f, 21.0f, 6.5238f)
                curveTo(21.0f, 6.9183f, 20.6733f, 7.2381f, 20.2703f, 7.2381f)
                horizontalLineTo(3.7297f)
                curveTo(3.3267f, 7.2381f, 3.0f, 6.9183f, 3.0f, 6.5238f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.5956f, 22.0001f)
                horizontalLineTo(12.4044f)
                curveTo(15.1871f, 22.0001f, 16.5785f, 22.0001f, 17.4831f, 21.1142f)
                curveTo(18.3878f, 20.2283f, 18.4803f, 18.7751f, 18.6654f, 15.8686f)
                lineTo(18.9321f, 11.6807f)
                curveTo(19.0326f, 10.1037f, 19.0828f, 9.3152f, 18.6289f, 8.8156f)
                curveTo(18.1751f, 8.3159f, 17.4087f, 8.3159f, 15.876f, 8.3159f)
                horizontalLineTo(8.1241f)
                curveTo(6.5913f, 8.3159f, 5.8249f, 8.3159f, 5.371f, 8.8156f)
                curveTo(4.9172f, 9.3152f, 4.9674f, 10.1037f, 5.0679f, 11.6807f)
                lineTo(5.3346f, 15.8686f)
                curveTo(5.5197f, 18.7751f, 5.6122f, 20.2283f, 6.5169f, 21.1142f)
                curveTo(7.4215f, 22.0001f, 8.8129f, 22.0001f, 11.5956f, 22.0001f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.4254f, 11.4815f)
                curveTo(9.8376f, 11.4381f, 10.2051f, 11.7547f, 10.2463f, 12.1885f)
                lineTo(10.7463f, 17.4517f)
                curveTo(10.7875f, 17.8855f, 10.4868f, 18.2724f, 10.0747f, 18.3158f)
                curveTo(9.6625f, 18.3592f, 9.295f, 18.0426f, 9.2538f, 17.6088f)
                lineTo(8.7538f, 12.3456f)
                curveTo(8.7126f, 11.9118f, 9.0133f, 11.5249f, 9.4254f, 11.4815f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.5747f, 11.4815f)
                curveTo(14.9868f, 11.5249f, 15.2875f, 11.9118f, 15.2463f, 12.3456f)
                lineTo(14.7463f, 17.6088f)
                curveTo(14.7051f, 18.0426f, 14.3376f, 18.3592f, 13.9254f, 18.3158f)
                curveTo(13.5133f, 18.2724f, 13.2126f, 17.8855f, 13.2538f, 17.4517f)
                lineTo(13.7538f, 12.1885f)
                curveTo(13.795f, 11.7547f, 14.1625f, 11.4381f, 14.5747f, 11.4815f)
                close()
            }
        }
            .build()
        return _trashBinMinimalistic!!
    }

private var _trashBinMinimalistic: ImageVector? = null
