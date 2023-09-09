package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.outline.SecurityGroup

public val SecurityGroup.EyeScan: ImageVector
    get() {
        if (_eyeScan != null) {
            return _eyeScan!!
        }
        _eyeScan = Builder(name = "EyeScan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2892f, 2.8898f)
                curveTo(17.2615f, 2.7516f, 15.9068f, 2.75f, 14.0f, 2.75f)
                curveTo(13.5858f, 2.75f, 13.25f, 2.4142f, 13.25f, 2.0f)
                curveTo(13.25f, 1.5858f, 13.5858f, 1.25f, 14.0f, 1.25f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 1.25f, 17.3498f, 1.25f, 18.489f, 1.4031f)
                curveTo(19.6615f, 1.5608f, 20.6104f, 1.8929f, 21.3588f, 2.6412f)
                curveTo(22.0432f, 3.3257f, 22.417f, 3.9766f, 22.5924f, 4.982f)
                curveTo(22.7501f, 5.8857f, 22.7501f, 7.1045f, 22.75f, 8.9037f)
                lineTo(22.75f, 9.0f)
                curveTo(22.75f, 9.4142f, 22.4142f, 9.75f, 22.0f, 9.75f)
                curveTo(21.5858f, 9.75f, 21.25f, 9.4142f, 21.25f, 9.0f)
                curveTo(21.25f, 7.0809f, 21.2471f, 5.9986f, 21.1147f, 5.2398f)
                curveTo(20.9973f, 4.5667f, 20.7852f, 4.189f, 20.2981f, 3.7019f)
                curveTo(19.8749f, 3.2787f, 19.2952f, 3.025f, 18.2892f, 2.8898f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 15.0f)
                curveTo(2.75f, 14.5858f, 2.4142f, 14.25f, 2.0f, 14.25f)
                curveTo(1.5858f, 14.25f, 1.25f, 14.5858f, 1.25f, 15.0f)
                lineTo(1.25f, 15.0963f)
                curveTo(1.25f, 16.8955f, 1.2499f, 18.1143f, 1.4076f, 19.018f)
                curveTo(1.583f, 20.0233f, 1.9568f, 20.6743f, 2.6412f, 21.3588f)
                curveTo(3.3896f, 22.1071f, 4.3386f, 22.4392f, 5.511f, 22.5969f)
                curveTo(6.6502f, 22.75f, 8.1058f, 22.75f, 9.9436f, 22.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 22.75f, 10.75f, 22.4142f, 10.75f, 22.0f)
                curveTo(10.75f, 21.5858f, 10.4142f, 21.25f, 10.0f, 21.25f)
                curveTo(8.0932f, 21.25f, 6.7385f, 21.2484f, 5.7108f, 21.1102f)
                curveTo(4.7048f, 20.975f, 4.1251f, 20.7213f, 3.7019f, 20.2981f)
                curveTo(3.2148f, 19.811f, 3.0027f, 19.4333f, 2.8853f, 18.7602f)
                curveTo(2.7529f, 18.0014f, 2.75f, 16.9191f, 2.75f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.75f, 15.0f)
                curveTo(22.75f, 14.5858f, 22.4142f, 14.25f, 22.0f, 14.25f)
                curveTo(21.5858f, 14.25f, 21.25f, 14.5858f, 21.25f, 15.0f)
                curveTo(21.25f, 16.9191f, 21.2471f, 18.0014f, 21.1147f, 18.7602f)
                curveTo(20.9973f, 19.4333f, 20.7852f, 19.811f, 20.2981f, 20.2981f)
                curveTo(19.8749f, 20.7213f, 19.2952f, 20.975f, 18.2892f, 21.1102f)
                curveTo(17.2615f, 21.2484f, 15.9068f, 21.25f, 14.0f, 21.25f)
                curveTo(13.5858f, 21.25f, 13.25f, 21.5858f, 13.25f, 22.0f)
                curveTo(13.25f, 22.4142f, 13.5858f, 22.75f, 14.0f, 22.75f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 22.75f, 17.3498f, 22.75f, 18.489f, 22.5969f)
                curveTo(19.6615f, 22.4392f, 20.6104f, 22.1071f, 21.3588f, 21.3588f)
                curveTo(22.0432f, 20.6743f, 22.417f, 20.0233f, 22.5924f, 19.018f)
                curveTo(22.7501f, 18.1143f, 22.7501f, 16.8955f, 22.75f, 15.0963f)
                lineTo(22.75f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 1.25f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 1.25f, 6.6502f, 1.25f, 5.511f, 1.4031f)
                curveTo(4.3386f, 1.5608f, 3.3896f, 1.8929f, 2.6412f, 2.6412f)
                curveTo(1.9568f, 3.3257f, 1.583f, 3.9766f, 1.4076f, 4.982f)
                curveTo(1.2499f, 5.8857f, 1.25f, 7.1045f, 1.25f, 8.9036f)
                lineTo(1.25f, 9.0f)
                curveTo(1.25f, 9.4142f, 1.5858f, 9.75f, 2.0f, 9.75f)
                curveTo(2.4142f, 9.75f, 2.75f, 9.4142f, 2.75f, 9.0f)
                curveTo(2.75f, 7.0809f, 2.7529f, 5.9986f, 2.8853f, 5.2398f)
                curveTo(3.0027f, 4.5667f, 3.2148f, 4.189f, 3.7019f, 3.7019f)
                curveTo(4.1251f, 3.2787f, 4.7048f, 3.025f, 5.7108f, 2.8898f)
                curveTo(6.7385f, 2.7516f, 8.0932f, 2.75f, 10.0f, 2.75f)
                curveTo(10.4142f, 2.75f, 10.75f, 2.4142f, 10.75f, 2.0f)
                curveTo(10.75f, 1.5858f, 10.4142f, 1.25f, 10.0f, 1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 9.25f)
                curveTo(10.4812f, 9.25f, 9.25f, 10.4812f, 9.25f, 12.0f)
                curveTo(9.25f, 13.5188f, 10.4812f, 14.75f, 12.0f, 14.75f)
                curveTo(13.5188f, 14.75f, 14.75f, 13.5188f, 14.75f, 12.0f)
                curveTo(14.75f, 10.4812f, 13.5188f, 9.25f, 12.0f, 9.25f)
                close()
                moveTo(10.75f, 12.0f)
                curveTo(10.75f, 11.3096f, 11.3096f, 10.75f, 12.0f, 10.75f)
                curveTo(12.6904f, 10.75f, 13.25f, 11.3096f, 13.25f, 12.0f)
                curveTo(13.25f, 12.6904f, 12.6904f, 13.25f, 12.0f, 13.25f)
                curveTo(11.3096f, 13.25f, 10.75f, 12.6904f, 10.75f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.3244f, 9.4505f)
                curveTo(6.5943f, 7.9774f, 8.7764f, 6.25f, 12.0f, 6.25f)
                curveTo(15.2236f, 6.25f, 17.4057f, 7.9774f, 18.6756f, 9.4505f)
                lineTo(18.7079f, 9.4879f)
                curveTo(18.9789f, 9.802f, 19.2576f, 10.125f, 19.4491f, 10.5121f)
                curveTo(19.6632f, 10.9448f, 19.75f, 11.4094f, 19.75f, 12.0f)
                curveTo(19.75f, 12.5906f, 19.6632f, 13.0552f, 19.4491f, 13.4879f)
                curveTo(19.2576f, 13.875f, 18.9789f, 14.198f, 18.7079f, 14.5121f)
                lineTo(18.6756f, 14.5495f)
                curveTo(17.4057f, 16.0226f, 15.2236f, 17.75f, 12.0f, 17.75f)
                curveTo(8.7764f, 17.75f, 6.5943f, 16.0226f, 5.3244f, 14.5495f)
                lineTo(5.2921f, 14.5121f)
                curveTo(5.0211f, 14.198f, 4.7424f, 13.875f, 4.5509f, 13.4879f)
                curveTo(4.3368f, 13.0552f, 4.25f, 12.5906f, 4.25f, 12.0f)
                curveTo(4.25f, 11.4094f, 4.3368f, 10.9448f, 4.5509f, 10.5121f)
                curveTo(4.7424f, 10.125f, 5.0211f, 9.802f, 5.2921f, 9.4879f)
                lineTo(5.3244f, 9.4505f)
                close()
                moveTo(12.0f, 7.75f)
                curveTo(9.369f, 7.75f, 7.5664f, 9.1471f, 6.4605f, 10.4299f)
                curveTo(6.1465f, 10.7941f, 5.9937f, 10.9785f, 5.8953f, 11.1773f)
                curveTo(5.812f, 11.3457f, 5.75f, 11.566f, 5.75f, 12.0f)
                curveTo(5.75f, 12.434f, 5.812f, 12.6543f, 5.8953f, 12.8227f)
                curveTo(5.9937f, 13.0215f, 6.1465f, 13.2059f, 6.4605f, 13.5701f)
                curveTo(7.5664f, 14.8529f, 9.369f, 16.25f, 12.0f, 16.25f)
                curveTo(14.631f, 16.25f, 16.4336f, 14.8529f, 17.5395f, 13.5701f)
                curveTo(17.8535f, 13.2059f, 18.0063f, 13.0215f, 18.1047f, 12.8227f)
                curveTo(18.188f, 12.6543f, 18.25f, 12.434f, 18.25f, 12.0f)
                curveTo(18.25f, 11.566f, 18.188f, 11.3457f, 18.1047f, 11.1773f)
                curveTo(18.0063f, 10.9785f, 17.8535f, 10.7941f, 17.5395f, 10.4299f)
                curveTo(16.4336f, 9.1471f, 14.631f, 7.75f, 12.0f, 7.75f)
                close()
            }
        }
        .build()
        return _eyeScan!!
    }

private var _eyeScan: ImageVector? = null
