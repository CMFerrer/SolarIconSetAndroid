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

val FilesGroup.FileCheck: ImageVector
    get() {
        if (_fileCheck != null) {
            return _fileCheck!!
        }
        _fileCheck = Builder(
            name = "FileCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2387f, 2.0f, 10.0298f, 2.0f)
                curveTo(10.6358f, 2.0f, 11.1214f, 2.0f, 11.53f, 2.0167f)
                curveTo(11.5166f, 2.0966f, 11.5095f, 2.1781f, 11.5092f, 2.2606f)
                lineTo(11.5f, 5.095f)
                curveTo(11.4999f, 6.1921f, 11.4998f, 7.1616f, 11.6049f, 7.9432f)
                curveTo(11.7188f, 8.7903f, 11.9803f, 9.6373f, 12.6716f, 10.3285f)
                curveTo(13.3628f, 11.0198f, 14.2098f, 11.2813f, 15.0569f, 11.3952f)
                curveTo(15.8385f, 11.5003f, 16.808f, 11.5002f, 17.9051f, 11.5001f)
                lineTo(18.0f, 11.5001f)
                horizontalLineTo(21.9574f)
                curveTo(22.0f, 12.0344f, 22.0f, 12.6901f, 22.0f, 13.5629f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.5606f, 15.4983f)
                curveTo(10.8358f, 15.1887f, 10.8079f, 14.7146f, 10.4983f, 14.4395f)
                curveTo(10.1887f, 14.1643f, 9.7146f, 14.1921f, 9.4395f, 14.5017f)
                lineTo(7.3333f, 16.8711f)
                lineTo(6.5606f, 16.0017f)
                curveTo(6.2854f, 15.6921f, 5.8113f, 15.6643f, 5.5017f, 15.9395f)
                curveTo(5.1922f, 16.2146f, 5.1643f, 16.6887f, 5.4394f, 16.9983f)
                lineTo(6.7728f, 18.4983f)
                curveTo(6.9151f, 18.6584f, 7.1191f, 18.75f, 7.3333f, 18.75f)
                curveTo(7.5476f, 18.75f, 7.7516f, 18.6584f, 7.8939f, 18.4983f)
                lineTo(10.5606f, 15.4983f)
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
        return _fileCheck!!
    }

private var _fileCheck: ImageVector? = null
