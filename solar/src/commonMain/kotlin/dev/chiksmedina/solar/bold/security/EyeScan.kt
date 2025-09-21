package dev.chiksmedina.solar.bold.security

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
import dev.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.EyeScan: ImageVector
    get() {
        if (_eyeScan != null) {
            return _eyeScan!!
        }
        _eyeScan = Builder(
            name = "EyeScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 2.75f)
                curveTo(15.9068f, 2.75f, 17.2615f, 2.7516f, 18.2892f, 2.8898f)
                curveTo(19.2952f, 3.025f, 19.8749f, 3.2787f, 20.2981f, 3.7019f)
                curveTo(20.7852f, 4.189f, 20.9973f, 4.5667f, 21.1147f, 5.2398f)
                curveTo(21.2471f, 5.9986f, 21.25f, 7.0809f, 21.25f, 9.0f)
                curveTo(21.25f, 9.4142f, 21.5858f, 9.75f, 22.0f, 9.75f)
                curveTo(22.4142f, 9.75f, 22.75f, 9.4142f, 22.75f, 9.0f)
                lineTo(22.75f, 8.9037f)
                curveTo(22.7501f, 7.1045f, 22.7501f, 5.8857f, 22.5924f, 4.982f)
                curveTo(22.417f, 3.9766f, 22.0432f, 3.3257f, 21.3588f, 2.6412f)
                curveTo(20.6104f, 1.8929f, 19.6615f, 1.5608f, 18.489f, 1.4031f)
                curveTo(17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f, 1.25f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 1.25f, 13.25f, 1.5858f, 13.25f, 2.0f)
                curveTo(13.25f, 2.4142f, 13.5858f, 2.75f, 14.0f, 2.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.25f)
                curveTo(2.4142f, 14.25f, 2.75f, 14.5858f, 2.75f, 15.0f)
                curveTo(2.75f, 16.9191f, 2.7529f, 18.0014f, 2.8853f, 18.7602f)
                curveTo(3.0027f, 19.4333f, 3.2148f, 19.811f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1102f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                curveTo(10.4142f, 21.25f, 10.75f, 21.5858f, 10.75f, 22.0f)
                curveTo(10.75f, 22.4142f, 10.4142f, 22.75f, 10.0f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4392f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.9568f, 20.6743f, 1.583f, 20.0233f, 1.4076f, 19.018f)
                curveTo(1.2499f, 18.1143f, 1.25f, 16.8955f, 1.25f, 15.0964f)
                lineTo(1.25f, 15.0f)
                curveTo(1.25f, 14.5858f, 1.5858f, 14.25f, 2.0f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.25f)
                curveTo(22.4142f, 14.25f, 22.75f, 14.5858f, 22.75f, 15.0f)
                lineTo(22.75f, 15.0963f)
                curveTo(22.7501f, 16.8955f, 22.7501f, 18.1143f, 22.5924f, 19.018f)
                curveTo(22.417f, 20.0233f, 22.0432f, 20.6743f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6615f, 22.4392f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(14.0f)
                curveTo(13.5858f, 22.75f, 13.25f, 22.4142f, 13.25f, 22.0f)
                curveTo(13.25f, 21.5858f, 13.5858f, 21.25f, 14.0f, 21.25f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1102f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7852f, 19.811f, 20.9973f, 19.4333f, 21.1147f, 18.7602f)
                curveTo(21.2471f, 18.0014f, 21.25f, 16.9191f, 21.25f, 15.0f)
                curveTo(21.25f, 14.5858f, 21.5858f, 14.25f, 22.0f, 14.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.9436f, 1.25f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 1.25f, 10.75f, 1.5858f, 10.75f, 2.0f)
                curveTo(10.75f, 2.4142f, 10.4142f, 2.75f, 10.0f, 2.75f)
                curveTo(8.0932f, 2.75f, 6.7385f, 2.7516f, 5.7108f, 2.8898f)
                curveTo(4.7048f, 3.025f, 4.1251f, 3.2787f, 3.7019f, 3.7019f)
                curveTo(3.2148f, 4.189f, 3.0027f, 4.5667f, 2.8853f, 5.2398f)
                curveTo(2.7529f, 5.9986f, 2.75f, 7.0809f, 2.75f, 9.0f)
                curveTo(2.75f, 9.4142f, 2.4142f, 9.75f, 2.0f, 9.75f)
                curveTo(1.5858f, 9.75f, 1.25f, 9.4142f, 1.25f, 9.0f)
                lineTo(1.25f, 8.9037f)
                curveTo(1.25f, 7.1045f, 1.2499f, 5.8857f, 1.4076f, 4.982f)
                curveTo(1.583f, 3.9766f, 1.9568f, 3.3257f, 2.6412f, 2.6412f)
                curveTo(3.3896f, 1.8929f, 4.3386f, 1.5608f, 5.511f, 1.4031f)
                curveTo(6.6502f, 1.25f, 8.1058f, 1.25f, 9.9436f, 1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.75f)
                curveTo(11.3096f, 10.75f, 10.75f, 11.3096f, 10.75f, 12.0f)
                curveTo(10.75f, 12.6904f, 11.3096f, 13.25f, 12.0f, 13.25f)
                curveTo(12.6904f, 13.25f, 13.25f, 12.6904f, 13.25f, 12.0f)
                curveTo(13.25f, 11.3096f, 12.6904f, 10.75f, 12.0f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.8924f, 14.0598f)
                curveTo(5.2975f, 13.3697f, 5.0f, 13.0246f, 5.0f, 12.0f)
                curveTo(5.0f, 10.9754f, 5.2975f, 10.6303f, 5.8924f, 9.9402f)
                curveTo(7.0804f, 8.5622f, 9.0727f, 7.0f, 12.0f, 7.0f)
                curveTo(14.9273f, 7.0f, 16.9196f, 8.5622f, 18.1076f, 9.9402f)
                curveTo(18.7025f, 10.6303f, 19.0f, 10.9754f, 19.0f, 12.0f)
                curveTo(19.0f, 13.0246f, 18.7025f, 13.3697f, 18.1076f, 14.0598f)
                curveTo(16.9196f, 15.4378f, 14.9273f, 17.0f, 12.0f, 17.0f)
                curveTo(9.0727f, 17.0f, 7.0804f, 15.4378f, 5.8924f, 14.0598f)
                close()
                moveTo(9.25f, 12.0f)
                curveTo(9.25f, 10.4812f, 10.4812f, 9.25f, 12.0f, 9.25f)
                curveTo(13.5188f, 9.25f, 14.75f, 10.4812f, 14.75f, 12.0f)
                curveTo(14.75f, 13.5188f, 13.5188f, 14.75f, 12.0f, 14.75f)
                curveTo(10.4812f, 14.75f, 9.25f, 13.5188f, 9.25f, 12.0f)
                close()
            }
        }
            .build()
        return _eyeScan!!
    }

private var _eyeScan: ImageVector? = null
