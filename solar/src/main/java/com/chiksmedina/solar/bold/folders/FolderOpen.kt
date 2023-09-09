package com.chiksmedina.solar.bold.folders

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
import com.chiksmedina.solar.bold.FoldersGroup

public val FoldersGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0694f, 9.9518f)
                curveTo(17.3989f, 9.9518f, 18.5317f, 9.9517f, 19.436f, 10.054f)
                curveTo(19.5895f, 10.0714f, 19.7425f, 10.0923f, 19.8943f, 10.1178f)
                curveTo(20.4264f, 10.2071f, 20.9447f, 10.3533f, 21.4242f, 10.6063f)
                verticalLineTo(9.7558f)
                curveTo(21.4242f, 8.8469f, 21.4243f, 8.0928f, 21.3389f, 7.4916f)
                curveTo(21.2489f, 6.857f, 21.0526f, 6.2946f, 20.5834f, 5.8324f)
                curveTo(20.5069f, 5.7571f, 20.4261f, 5.6855f, 20.3415f, 5.6181f)
                curveTo(19.8297f, 5.2102f, 19.2162f, 5.0434f, 18.5217f, 4.9661f)
                curveTo(17.8526f, 4.8916f, 17.0097f, 4.8916f, 15.9765f, 4.8916f)
                lineTo(15.6237f, 4.8916f)
                curveTo(14.6416f, 4.8916f, 14.2895f, 4.8859f, 13.9706f, 4.8053f)
                curveTo(13.7833f, 4.758f, 13.6035f, 4.6919f, 13.4348f, 4.6088f)
                curveTo(13.1505f, 4.4687f, 12.9028f, 4.2576f, 12.2072f, 3.6413f)
                lineTo(11.7331f, 3.2213f)
                curveTo(11.5341f, 3.0449f, 11.3982f, 2.9245f, 11.2526f, 2.8175f)
                curveTo(10.6279f, 2.3588f, 9.8673f, 2.0813f, 9.071f, 2.0153f)
                curveTo(8.8855f, 2.0f, 8.6963f, 2.0f, 8.4131f, 2.0f)
                lineTo(8.2967f, 2.0f)
                curveTo(7.656f, 1.9999f, 7.2332f, 1.9998f, 6.866f, 2.0612f)
                curveTo(5.2612f, 2.3295f, 3.9634f, 3.4514f, 3.6474f, 4.9357f)
                curveTo(3.5754f, 5.2734f, 3.5755f, 5.6603f, 3.5757f, 6.2185f)
                lineTo(3.5757f, 10.6063f)
                curveTo(4.0552f, 10.3533f, 4.5736f, 10.2071f, 5.1056f, 10.1178f)
                curveTo(5.2575f, 10.0923f, 5.4104f, 10.0714f, 5.5639f, 10.054f)
                curveTo(6.4682f, 9.9517f, 7.6011f, 9.9518f, 8.9305f, 9.9518f)
                horizontalLineTo(16.0694f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.3579f, 12.7788f)
                curveTo(2.7477f, 13.7202f, 2.9996f, 15.0292f, 3.5032f, 17.6471f)
                curveTo(3.8658f, 19.5317f, 4.0471f, 20.474f, 4.6752f, 21.0993f)
                curveTo(4.8382f, 21.2615f, 5.0205f, 21.4053f, 5.2186f, 21.5278f)
                curveTo(5.9819f, 22.0f, 6.9954f, 22.0f, 9.0223f, 22.0f)
                horizontalLineTo(15.9777f)
                curveTo(18.0046f, 22.0f, 19.0181f, 22.0f, 19.7814f, 21.5278f)
                curveTo(19.9795f, 21.4053f, 20.1618f, 21.2615f, 20.3248f, 21.0993f)
                curveTo(20.9529f, 20.474f, 21.1342f, 19.5317f, 21.4968f, 17.6471f)
                curveTo(22.0004f, 15.0292f, 22.2523f, 13.7202f, 21.6421f, 12.7788f)
                curveTo(21.4864f, 12.5386f, 21.2943f, 12.3211f, 21.0721f, 12.1334f)
                curveTo(20.2011f, 11.3976f, 18.7933f, 11.3976f, 15.9777f, 11.3976f)
                horizontalLineTo(9.0223f)
                curveTo(6.2067f, 11.3976f, 4.7989f, 11.3976f, 3.9279f, 12.1334f)
                curveTo(3.7057f, 12.3211f, 3.5136f, 12.5386f, 3.3579f, 12.7788f)
                close()
                moveTo(9.6952f, 17.1807f)
                curveTo(9.6952f, 16.7815f, 10.0376f, 16.4578f, 10.4601f, 16.4578f)
                horizontalLineTo(14.5398f)
                curveTo(14.9622f, 16.4578f, 15.3047f, 16.7815f, 15.3047f, 17.1807f)
                curveTo(15.3047f, 17.58f, 14.9622f, 17.9036f, 14.5398f, 17.9036f)
                horizontalLineTo(10.4601f)
                curveTo(10.0376f, 17.9036f, 9.6952f, 17.58f, 9.6952f, 17.1807f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
