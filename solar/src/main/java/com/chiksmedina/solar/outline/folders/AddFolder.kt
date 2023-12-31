package com.chiksmedina.solar.outline.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.FoldersGroup

val FoldersGroup.AddFolder: ImageVector
    get() {
        if (_addFolder != null) {
            return _addFolder!!
        }
        _addFolder = Builder(
            name = "AddFolder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.8593f, 1.25f)
                curveTo(6.889f, 1.25f, 6.9192f, 1.25f, 6.9498f, 1.25f)
                lineTo(6.9868f, 1.25f)
                curveTo(7.3382f, 1.25f, 7.5643f, 1.25f, 7.7854f, 1.2707f)
                curveTo(8.7367f, 1.3596f, 9.639f, 1.7334f, 10.3746f, 2.3431f)
                curveTo(10.5456f, 2.4848f, 10.7055f, 2.6448f, 10.954f, 2.8933f)
                lineTo(11.5303f, 3.4697f)
                curveTo(12.3761f, 4.3154f, 12.7012f, 4.6311f, 13.0768f, 4.8401f)
                curveTo(13.2948f, 4.9613f, 13.526f, 5.0571f, 13.766f, 5.1255f)
                curveTo(14.1793f, 5.2433f, 14.6324f, 5.25f, 15.8284f, 5.25f)
                lineTo(16.253f, 5.25f)
                curveTo(17.526f, 5.25f, 18.5521f, 5.25f, 19.364f, 5.3521f)
                curveTo(20.2054f, 5.4578f, 20.9204f, 5.6836f, 21.5077f, 6.2119f)
                curveTo(21.6061f, 6.3003f, 21.6997f, 6.3939f, 21.7882f, 6.4923f)
                curveTo(22.3165f, 7.0796f, 22.5422f, 7.7946f, 22.648f, 8.636f)
                curveTo(22.75f, 9.4479f, 22.75f, 10.4741f, 22.75f, 11.747f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4393f, 19.6615f, 22.1071f, 20.6104f, 21.3588f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6615f, 22.4393f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3386f, 22.4393f, 3.3896f, 22.1071f, 2.6413f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6615f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                lineTo(1.25f, 6.9498f)
                curveTo(1.25f, 6.9192f, 1.25f, 6.889f, 1.25f, 6.8593f)
                curveTo(1.2499f, 6.0634f, 1.2498f, 5.5568f, 1.3324f, 5.1193f)
                curveTo(1.6949f, 3.1979f, 3.1979f, 1.6949f, 5.1193f, 1.3324f)
                curveTo(5.5568f, 1.2498f, 6.0634f, 1.2499f, 6.8593f, 1.25f)
                close()
                moveTo(6.9498f, 2.75f)
                curveTo(6.0331f, 2.75f, 5.6787f, 2.7533f, 5.3975f, 2.8064f)
                curveTo(4.0828f, 3.0544f, 3.0544f, 4.0828f, 2.8064f, 5.3975f)
                curveTo(2.7533f, 5.6787f, 2.75f, 6.0331f, 2.75f, 6.9498f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8898f, 18.2892f)
                curveTo(3.025f, 19.2953f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7109f, 21.1103f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2892f, 21.1103f)
                curveTo(19.2953f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2953f, 21.1103f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                verticalLineTo(11.7979f)
                curveTo(21.25f, 10.4621f, 21.2486f, 9.5305f, 21.1597f, 8.8231f)
                curveTo(21.0731f, 8.1345f, 20.9141f, 7.7636f, 20.6729f, 7.4954f)
                curveTo(20.6198f, 7.4364f, 20.5637f, 7.3802f, 20.5046f, 7.3271f)
                curveTo(20.2365f, 7.0859f, 19.8656f, 6.9269f, 19.1769f, 6.8403f)
                curveTo(18.4695f, 6.7514f, 17.538f, 6.75f, 16.2021f, 6.75f)
                horizontalLineTo(15.8284f)
                curveTo(15.7912f, 6.75f, 15.7545f, 6.75f, 15.7182f, 6.75f)
                curveTo(14.6702f, 6.7502f, 13.9944f, 6.7504f, 13.3548f, 6.5681f)
                curveTo(13.0041f, 6.4681f, 12.6661f, 6.3281f, 12.3475f, 6.1508f)
                curveTo(11.7663f, 5.8275f, 11.2885f, 5.3495f, 10.5476f, 4.6083f)
                curveTo(10.522f, 4.5827f, 10.496f, 4.5567f, 10.4697f, 4.5304f)
                lineTo(9.9194f, 3.9801f)
                curveTo(9.6362f, 3.6968f, 9.5278f, 3.5895f, 9.4173f, 3.4979f)
                curveTo(8.914f, 3.0807f, 8.2966f, 2.825f, 7.6458f, 2.7641f)
                curveTo(7.5029f, 2.7508f, 7.3504f, 2.75f, 6.9498f, 2.75f)
                close()
                moveTo(12.0f, 11.25f)
                curveTo(12.4142f, 11.25f, 12.75f, 11.5858f, 12.75f, 12.0f)
                verticalLineTo(13.25f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 13.25f, 14.75f, 13.5858f, 14.75f, 14.0f)
                curveTo(14.75f, 14.4142f, 14.4142f, 14.75f, 14.0f, 14.75f)
                horizontalLineTo(12.75f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 16.4142f, 12.4142f, 16.75f, 12.0f, 16.75f)
                curveTo(11.5858f, 16.75f, 11.25f, 16.4142f, 11.25f, 16.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(10.0f)
                curveTo(9.5858f, 14.75f, 9.25f, 14.4142f, 9.25f, 14.0f)
                curveTo(9.25f, 13.5858f, 9.5858f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 11.5858f, 11.5858f, 11.25f, 12.0f, 11.25f)
                close()
            }
        }
            .build()
        return _addFolder!!
    }

private var _addFolder: ImageVector? = null
