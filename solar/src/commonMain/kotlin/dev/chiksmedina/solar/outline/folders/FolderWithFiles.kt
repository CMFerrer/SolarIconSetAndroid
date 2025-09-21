package dev.chiksmedina.solar.outline.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FoldersGroup

val FoldersGroup.FolderWithFiles: ImageVector
    get() {
        if (_folderWithFiles != null) {
            return _folderWithFiles!!
        }
        _folderWithFiles = Builder(
            name = "FolderWithFiles", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.8593f, 1.25f)
                curveTo(6.889f, 1.25f, 6.9192f, 1.25f, 6.9497f, 1.25f)
                lineTo(6.9867f, 1.25f)
                curveTo(7.3382f, 1.25f, 7.5643f, 1.25f, 7.7854f, 1.2707f)
                curveTo(8.6873f, 1.355f, 9.5451f, 1.6953f, 10.2586f, 2.25f)
                horizontalLineTo(16.5f)
                curveTo(16.5196f, 2.25f, 16.5388f, 2.25f, 16.5578f, 2.25f)
                curveTo(16.9665f, 2.2499f, 17.2449f, 2.2499f, 17.4895f, 2.2821f)
                curveTo(19.1722f, 2.5036f, 20.4964f, 3.8278f, 20.7179f, 5.5105f)
                curveTo(20.7263f, 5.574f, 20.7324f, 5.6397f, 20.737f, 5.7093f)
                curveTo(21.0145f, 5.8358f, 21.2714f, 5.9993f, 21.5077f, 6.2119f)
                curveTo(21.6061f, 6.3003f, 21.6997f, 6.3939f, 21.7882f, 6.4923f)
                curveTo(22.3164f, 7.0796f, 22.5422f, 7.7946f, 22.6479f, 8.636f)
                curveTo(22.75f, 9.4479f, 22.75f, 10.4741f, 22.75f, 11.747f)
                verticalLineTo(14.0564f)
                curveTo(22.75f, 15.8942f, 22.75f, 17.3498f, 22.5969f, 18.489f)
                curveTo(22.4392f, 19.6615f, 22.1071f, 20.6104f, 21.3587f, 21.3588f)
                curveTo(20.6104f, 22.1071f, 19.6614f, 22.4393f, 18.489f, 22.5969f)
                curveTo(17.3498f, 22.75f, 15.8942f, 22.75f, 14.0564f, 22.75f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.75f, 6.6502f, 22.75f, 5.511f, 22.5969f)
                curveTo(4.3385f, 22.4393f, 3.3896f, 22.1071f, 2.6412f, 21.3588f)
                curveTo(1.8929f, 20.6104f, 1.5608f, 19.6615f, 1.4031f, 18.489f)
                curveTo(1.25f, 17.3498f, 1.25f, 15.8942f, 1.25f, 14.0564f)
                lineTo(1.25f, 6.9498f)
                curveTo(1.25f, 6.9192f, 1.25f, 6.889f, 1.25f, 6.8593f)
                curveTo(1.2499f, 6.0634f, 1.2498f, 5.5568f, 1.3323f, 5.1193f)
                curveTo(1.6949f, 3.1979f, 3.1978f, 1.6949f, 5.1193f, 1.3324f)
                curveTo(5.5568f, 1.2498f, 6.0634f, 1.2499f, 6.8593f, 1.25f)
                close()
                moveTo(19.1473f, 5.3277f)
                curveTo(18.8895f, 4.5029f, 18.1732f, 3.8851f, 17.2937f, 3.7693f)
                curveTo(17.1597f, 3.7516f, 16.9882f, 3.75f, 16.5f, 3.75f)
                horizontalLineTo(11.8113f)
                curveTo(12.4542f, 4.3891f, 12.7459f, 4.656f, 13.0767f, 4.8401f)
                curveTo(13.2948f, 4.9613f, 13.526f, 5.0571f, 13.7659f, 5.1255f)
                curveTo(14.1792f, 5.2433f, 14.6324f, 5.25f, 15.8284f, 5.25f)
                lineTo(16.253f, 5.25f)
                curveTo(17.4153f, 5.25f, 18.3718f, 5.25f, 19.1473f, 5.3277f)
                close()
                moveTo(6.9497f, 2.75f)
                curveTo(6.0331f, 2.75f, 5.6787f, 2.7533f, 5.3974f, 2.8064f)
                curveTo(4.0827f, 3.0544f, 3.0544f, 4.0828f, 2.8063f, 5.3975f)
                curveTo(2.7533f, 5.6787f, 2.75f, 6.0331f, 2.75f, 6.9498f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 15.9068f, 2.7516f, 17.2615f, 2.8897f, 18.2892f)
                curveTo(3.025f, 19.2953f, 3.2787f, 19.8749f, 3.7019f, 20.2981f)
                curveTo(4.1251f, 20.7213f, 4.7048f, 20.975f, 5.7108f, 21.1103f)
                curveTo(6.7385f, 21.2484f, 8.0932f, 21.25f, 10.0f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.25f, 17.2615f, 21.2484f, 18.2891f, 21.1103f)
                curveTo(19.2952f, 20.975f, 19.8749f, 20.7213f, 20.2981f, 20.2981f)
                curveTo(20.7213f, 19.8749f, 20.975f, 19.2953f, 21.1102f, 18.2892f)
                curveTo(21.2484f, 17.2615f, 21.25f, 15.9068f, 21.25f, 14.0f)
                verticalLineTo(11.7979f)
                curveTo(21.25f, 10.4621f, 21.2486f, 9.5305f, 21.1597f, 8.8231f)
                curveTo(21.0731f, 8.1345f, 20.9141f, 7.7636f, 20.6729f, 7.4954f)
                curveTo(20.6198f, 7.4364f, 20.5636f, 7.3802f, 20.5046f, 7.3271f)
                curveTo(20.2364f, 7.0859f, 19.8655f, 6.9269f, 19.1769f, 6.8403f)
                curveTo(18.4695f, 6.7514f, 17.5379f, 6.75f, 16.2021f, 6.75f)
                horizontalLineTo(15.8284f)
                curveTo(15.7912f, 6.75f, 15.7545f, 6.75f, 15.7182f, 6.75f)
                curveTo(14.6702f, 6.7502f, 13.9944f, 6.7504f, 13.3547f, 6.5681f)
                curveTo(13.0041f, 6.4681f, 12.6661f, 6.3281f, 12.3475f, 6.1508f)
                curveTo(11.7663f, 5.8275f, 11.2885f, 5.3495f, 10.5476f, 4.6083f)
                curveTo(10.5219f, 4.5827f, 10.496f, 4.5567f, 10.4697f, 4.5304f)
                lineTo(9.9194f, 3.9801f)
                curveTo(9.6361f, 3.6968f, 9.5278f, 3.5895f, 9.4173f, 3.4979f)
                curveTo(8.914f, 3.0807f, 8.2966f, 2.825f, 7.6457f, 2.7641f)
                curveTo(7.5029f, 2.7508f, 7.3503f, 2.75f, 6.9497f, 2.75f)
                close()
                moveTo(12.25f, 10.0f)
                curveTo(12.25f, 9.5858f, 12.5858f, 9.25f, 13.0f, 9.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 9.25f, 18.75f, 9.5858f, 18.75f, 10.0f)
                curveTo(18.75f, 10.4142f, 18.4142f, 10.75f, 18.0f, 10.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 10.75f, 12.25f, 10.4142f, 12.25f, 10.0f)
                close()
            }
        }
            .build()
        return _folderWithFiles!!
    }

private var _folderWithFiles: ImageVector? = null
