package com.chiksmedina.solar.boldduotone.files

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
import com.chiksmedina.solar.boldduotone.FilesGroup

val FilesGroup.CloudFile: ImageVector
    get() {
        if (_cloudFile != null) {
            return _cloudFile!!
        }
        _cloudFile = Builder(
            name = "CloudFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                verticalLineTo(13.5629f)
                curveTo(22.0f, 12.6901f, 22.0f, 12.0344f, 21.9574f, 11.5001f)
                horizontalLineTo(18.0f)
                lineTo(17.9051f, 11.5001f)
                curveTo(16.808f, 11.5002f, 15.8385f, 11.5003f, 15.0569f, 11.3952f)
                curveTo(14.2098f, 11.2813f, 13.3628f, 11.0198f, 12.6716f, 10.3285f)
                curveTo(11.9803f, 9.6373f, 11.7188f, 8.7903f, 11.6049f, 7.9432f)
                curveTo(11.4998f, 7.1616f, 11.4999f, 6.1921f, 11.5f, 5.095f)
                lineTo(11.5092f, 2.2606f)
                curveTo(11.5095f, 2.1781f, 11.5166f, 2.0966f, 11.53f, 2.0167f)
                curveTo(11.1214f, 2.0f, 10.6358f, 2.0f, 10.0298f, 2.0f)
                curveTo(6.2387f, 2.0f, 4.3432f, 2.0f, 3.1716f, 3.1716f)
                curveTo(2.0f, 4.3432f, 2.0f, 6.2288f, 2.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.0f, 16.2353f)
                curveTo(13.0f, 17.2099f, 12.1046f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(7.5f)
                curveTo(6.6716f, 18.0f, 6.0f, 17.4074f, 6.0f, 16.6765f)
                curveTo(6.0f, 15.9455f, 6.6716f, 15.3529f, 7.5f, 15.3529f)
                curveTo(7.5994f, 15.3529f, 7.6966f, 15.3615f, 7.7907f, 15.3778f)
                curveTo(7.7105f, 15.1868f, 7.6667f, 14.9803f, 7.6667f, 14.7647f)
                curveTo(7.6667f, 13.7901f, 8.5621f, 13.0f, 9.6667f, 13.0f)
                curveTo(10.6956f, 13.0f, 11.543f, 13.6855f, 11.6543f, 14.5672f)
                curveTo(12.4375f, 14.8063f, 13.0f, 15.4629f, 13.0f, 16.2353f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.5092f, 2.2601f)
                lineTo(11.5f, 5.0945f)
                curveTo(11.4999f, 6.1916f, 11.4998f, 7.1612f, 11.6049f, 7.9427f)
                curveTo(11.7188f, 8.7898f, 11.9803f, 9.6368f, 12.6716f, 10.3281f)
                curveTo(13.3629f, 11.0193f, 14.2098f, 11.2808f, 15.057f, 11.3947f)
                curveTo(15.8385f, 11.4998f, 16.808f, 11.4997f, 17.9051f, 11.4996f)
                lineTo(21.9574f, 11.4996f)
                curveTo(21.9698f, 11.6552f, 21.9786f, 11.821f, 21.9848f, 11.9995f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 11.732f, 22.0f, 11.5983f, 21.9901f, 11.4408f)
                curveTo(21.9335f, 10.5463f, 21.5617f, 9.5212f, 21.0315f, 8.7985f)
                curveTo(20.9382f, 8.6713f, 20.8743f, 8.5949f, 20.7467f, 8.4422f)
                curveTo(19.9542f, 7.4936f, 18.911f, 6.3119f, 18.0f, 5.4995f)
                curveTo(17.1892f, 4.7765f, 16.0787f, 3.9854f, 15.1101f, 3.3385f)
                curveTo(14.2781f, 2.7827f, 13.862f, 2.5049f, 13.2915f, 2.2983f)
                curveTo(13.1403f, 2.2436f, 12.9408f, 2.1831f, 12.7846f, 2.1447f)
                curveTo(12.4006f, 2.0501f, 12.0268f, 2.0173f, 11.5f, 2.0059f)
                lineTo(11.5092f, 2.2601f)
                close()
            }
        }
            .build()
        return _cloudFile!!
    }

private var _cloudFile: ImageVector? = null
