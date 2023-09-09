package com.chiksmedina.solar.boldduotone.folders

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
import com.chiksmedina.solar.boldduotone.FoldersGroup

public val FoldersGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.3579f, 12.7787f)
                curveTo(2.7477f, 13.7201f, 2.9996f, 15.0291f, 3.5032f, 17.647f)
                curveTo(3.8658f, 19.5316f, 4.0471f, 20.4738f, 4.6752f, 21.0991f)
                curveTo(4.8382f, 21.2614f, 5.0205f, 21.4052f, 5.2186f, 21.5277f)
                curveTo(5.9819f, 21.9999f, 6.9954f, 21.9999f, 9.0223f, 21.9999f)
                horizontalLineTo(15.9777f)
                curveTo(18.0046f, 21.9999f, 19.0181f, 21.9999f, 19.7814f, 21.5277f)
                curveTo(19.9795f, 21.4052f, 20.1618f, 21.2614f, 20.3248f, 21.0991f)
                curveTo(20.9529f, 20.4738f, 21.1342f, 19.5316f, 21.4968f, 17.647f)
                curveTo(22.0004f, 15.0291f, 22.2523f, 13.7201f, 21.6421f, 12.7787f)
                curveTo(21.4864f, 12.5384f, 21.2943f, 12.321f, 21.0721f, 12.1332f)
                curveTo(20.2011f, 11.3975f, 18.7933f, 11.3975f, 15.9777f, 11.3975f)
                horizontalLineTo(9.0223f)
                curveTo(6.2067f, 11.3975f, 4.7989f, 11.3975f, 3.9279f, 12.1332f)
                curveTo(3.7057f, 12.321f, 3.5136f, 12.5384f, 3.3579f, 12.7787f)
                close()
                moveTo(9.6952f, 17.1806f)
                curveTo(9.6952f, 16.7814f, 10.0376f, 16.4577f, 10.4601f, 16.4577f)
                horizontalLineTo(14.5398f)
                curveTo(14.9622f, 16.4577f, 15.3047f, 16.7814f, 15.3047f, 17.1806f)
                curveTo(15.3047f, 17.5798f, 14.9622f, 17.9035f, 14.5398f, 17.9035f)
                horizontalLineTo(10.4601f)
                curveTo(10.0376f, 17.9035f, 9.6952f, 17.5798f, 9.6952f, 17.1806f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5762f, 12.4846f)
                curveTo(3.6827f, 12.3586f, 3.8003f, 12.241f, 3.9279f, 12.1332f)
                curveTo(4.7989f, 11.3975f, 6.2067f, 11.3975f, 9.0223f, 11.3975f)
                horizontalLineTo(15.9777f)
                curveTo(18.7933f, 11.3975f, 20.2011f, 11.3975f, 21.0721f, 12.1332f)
                curveTo(21.2f, 12.2413f, 21.3179f, 12.3592f, 21.4247f, 12.4857f)
                verticalLineTo(9.7558f)
                curveTo(21.4247f, 8.8469f, 21.4247f, 8.0928f, 21.3394f, 7.4916f)
                curveTo(21.2494f, 6.857f, 21.0531f, 6.2946f, 20.5839f, 5.8324f)
                curveTo(20.5074f, 5.7571f, 20.4266f, 5.6855f, 20.342f, 5.6181f)
                curveTo(19.8302f, 5.2102f, 19.2167f, 5.0434f, 18.5222f, 4.9661f)
                curveTo(17.8531f, 4.8916f, 17.0102f, 4.8916f, 15.9769f, 4.8916f)
                lineTo(15.6242f, 4.8916f)
                curveTo(14.6421f, 4.8916f, 14.29f, 4.8859f, 13.9711f, 4.8053f)
                curveTo(13.7837f, 4.758f, 13.604f, 4.6919f, 13.4352f, 4.6088f)
                curveTo(13.151f, 4.4687f, 12.9033f, 4.2576f, 12.2077f, 3.6413f)
                lineTo(11.7336f, 3.2213f)
                curveTo(11.5345f, 3.0449f, 11.3987f, 2.9245f, 11.2531f, 2.8175f)
                curveTo(10.6284f, 2.3588f, 9.8678f, 2.0813f, 9.0715f, 2.0153f)
                curveTo(8.886f, 2.0f, 8.6968f, 2.0f, 8.4136f, 2.0f)
                lineTo(8.2971f, 2.0f)
                curveTo(7.6565f, 1.9999f, 7.2337f, 1.9998f, 6.8665f, 2.0612f)
                curveTo(5.2617f, 2.3295f, 3.9639f, 3.4514f, 3.6478f, 4.9358f)
                curveTo(3.5759f, 5.2734f, 3.576f, 5.6603f, 3.5762f, 6.2185f)
                lineTo(3.5762f, 12.4846f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
