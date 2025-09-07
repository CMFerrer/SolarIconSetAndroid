package com.chiksmedina.solar.bold.essentionalui

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
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.TrashBinTrash: ImageVector
    get() {
        if (_trashBinTrash != null) {
            return _trashBinTrash!!
        }
        _trashBinTrash = Builder(
            name = "TrashBinTrash", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(3.0f, 6.386f)
                curveTo(3.0f, 5.9015f, 3.3454f, 5.5088f, 3.7714f, 5.5088f)
                lineTo(6.4357f, 5.5083f)
                curveTo(6.965f, 5.4931f, 7.432f, 5.1103f, 7.6121f, 4.5441f)
                curveTo(7.6169f, 4.5292f, 7.6223f, 4.5109f, 7.6418f, 4.4442f)
                lineTo(7.7566f, 4.0526f)
                curveTo(7.8269f, 3.8124f, 7.8881f, 3.6032f, 7.9738f, 3.4162f)
                curveTo(8.3121f, 2.6774f, 8.9381f, 2.1643f, 9.6615f, 2.033f)
                curveTo(9.8446f, 1.9997f, 10.0385f, 1.9999f, 10.2611f, 2.0f)
                horizontalLineTo(13.7391f)
                curveTo(13.9617f, 1.9999f, 14.1556f, 1.9997f, 14.3387f, 2.033f)
                curveTo(15.0621f, 2.1643f, 15.6881f, 2.6774f, 16.0264f, 3.4162f)
                curveTo(16.1121f, 3.6032f, 16.1733f, 3.8124f, 16.2435f, 4.0526f)
                lineTo(16.3583f, 4.4442f)
                curveTo(16.3778f, 4.5109f, 16.3833f, 4.5292f, 16.388f, 4.5441f)
                curveTo(16.5682f, 5.1103f, 17.1278f, 5.4935f, 17.6571f, 5.5088f)
                horizontalLineTo(20.2286f)
                curveTo(20.6546f, 5.5088f, 21.0f, 5.9015f, 21.0f, 6.386f)
                curveTo(21.0f, 6.8704f, 20.6546f, 7.2632f, 20.2286f, 7.2632f)
                horizontalLineTo(3.7714f)
                curveTo(3.3454f, 7.2632f, 3.0f, 6.8704f, 3.0f, 6.386f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5956f, 22.0001f)
                horizontalLineTo(12.4044f)
                curveTo(15.1871f, 22.0001f, 16.5785f, 22.0001f, 17.4831f, 21.1142f)
                curveTo(18.3878f, 20.2283f, 18.4803f, 18.7751f, 18.6654f, 15.8686f)
                lineTo(18.9321f, 11.6807f)
                curveTo(19.0326f, 10.1037f, 19.0828f, 9.3152f, 18.6289f, 8.8156f)
                curveTo(18.1751f, 8.3159f, 17.4087f, 8.3159f, 15.876f, 8.3159f)
                horizontalLineTo(8.124f)
                curveTo(6.5913f, 8.3159f, 5.8249f, 8.3159f, 5.371f, 8.8156f)
                curveTo(4.9172f, 9.3152f, 4.9674f, 10.1037f, 5.0679f, 11.6807f)
                lineTo(5.3346f, 15.8686f)
                curveTo(5.5197f, 18.7751f, 5.6122f, 20.2283f, 6.5169f, 21.1142f)
                curveTo(7.4215f, 22.0001f, 8.8129f, 22.0001f, 11.5956f, 22.0001f)
                close()
                moveTo(10.2463f, 12.1886f)
                curveTo(10.2051f, 11.7548f, 9.8375f, 11.4382f, 9.4254f, 11.4816f)
                curveTo(9.0132f, 11.525f, 8.7125f, 11.9119f, 8.7537f, 12.3457f)
                lineTo(9.2537f, 17.6089f)
                curveTo(9.2949f, 18.0427f, 9.6625f, 18.3593f, 10.0746f, 18.3159f)
                curveTo(10.4868f, 18.2725f, 10.7875f, 17.8856f, 10.7463f, 17.4518f)
                lineTo(10.2463f, 12.1886f)
                close()
                moveTo(14.5746f, 11.4816f)
                curveTo(14.9868f, 11.525f, 15.2875f, 11.9119f, 15.2463f, 12.3457f)
                lineTo(14.7463f, 17.6089f)
                curveTo(14.7051f, 18.0427f, 14.3375f, 18.3593f, 13.9254f, 18.3159f)
                curveTo(13.5132f, 18.2725f, 13.2125f, 17.8856f, 13.2537f, 17.4518f)
                lineTo(13.7537f, 12.1886f)
                curveTo(13.7949f, 11.7548f, 14.1625f, 11.4382f, 14.5746f, 11.4816f)
                close()
            }
        }
            .build()
        return _trashBinTrash!!
    }

private var _trashBinTrash: ImageVector? = null
