package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.TrashBinMinimalistic: ImageVector
    get() {
        if (_trashBinMinimalistic != null) {
            return _trashBinMinimalistic!!
        }
        _trashBinMinimalistic = Builder(name = "TrashBinMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5956f, 22.0f)
                horizontalLineTo(12.4044f)
                curveTo(15.1871f, 22.0f, 16.5785f, 22.0f, 17.4831f, 21.1141f)
                curveTo(18.3878f, 20.2281f, 18.4803f, 18.7749f, 18.6654f, 15.8685f)
                lineTo(18.9321f, 11.6806f)
                curveTo(19.0326f, 10.1036f, 19.0828f, 9.3151f, 18.6289f, 8.8154f)
                curveTo(18.1751f, 8.3158f, 17.4087f, 8.3158f, 15.876f, 8.3158f)
                horizontalLineTo(8.124f)
                curveTo(6.5913f, 8.3158f, 5.8249f, 8.3158f, 5.371f, 8.8154f)
                curveTo(4.9172f, 9.3151f, 4.9674f, 10.1036f, 5.0679f, 11.6806f)
                lineTo(5.3346f, 15.8685f)
                curveTo(5.5197f, 18.7749f, 5.6122f, 20.2281f, 6.5169f, 21.1141f)
                curveTo(7.4215f, 22.0f, 8.8129f, 22.0f, 11.5956f, 22.0f)
                close()
                moveTo(10.2463f, 12.1885f)
                curveTo(10.2051f, 11.7546f, 9.8375f, 11.4381f, 9.4254f, 11.4815f)
                curveTo(9.0132f, 11.5249f, 8.7125f, 11.9117f, 8.7537f, 12.3456f)
                lineTo(9.2537f, 17.6087f)
                curveTo(9.2949f, 18.0426f, 9.6625f, 18.3591f, 10.0746f, 18.3157f)
                curveTo(10.4868f, 18.2724f, 10.7875f, 17.8855f, 10.7463f, 17.4516f)
                lineTo(10.2463f, 12.1885f)
                close()
                moveTo(14.5746f, 11.4815f)
                curveTo(14.9868f, 11.5249f, 15.2875f, 11.9117f, 15.2463f, 12.3456f)
                lineTo(14.7463f, 17.6087f)
                curveTo(14.7051f, 18.0426f, 14.3375f, 18.3591f, 13.9254f, 18.3157f)
                curveTo(13.5132f, 18.2724f, 13.2125f, 17.8855f, 13.2537f, 17.4516f)
                lineTo(13.7537f, 12.1885f)
                curveTo(13.7949f, 11.7546f, 14.1625f, 11.4381f, 14.5746f, 11.4815f)
                close()
            }
        }
        .build()
        return _trashBinMinimalistic!!
    }

private var _trashBinMinimalistic: ImageVector? = null
